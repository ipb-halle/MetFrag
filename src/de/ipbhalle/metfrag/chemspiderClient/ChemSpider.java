/*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
*/

package de.ipbhalle.metfrag.chemspiderClient;

import java.io.IOException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.zip.GZIPInputStream;

import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.log4j.Logger;
import org.openscience.cdk.ChemFile;
import org.openscience.cdk.ChemObject;
import org.openscience.cdk.exception.CDKException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.io.MDLV2000Reader;
import org.openscience.cdk.tools.manipulator.ChemFileManipulator;

import com.chemspider.www.MassSpecAPIStub;
import com.chemspider.www.MassSpecAPIStub.ECompression;
import com.chemspider.www.MassSpecAPIStub.GetRecordMol;
import com.chemspider.www.MassSpecAPIStub.GetRecordMolResponse;
import com.chemspider.www.MassSpecAPIStub.GetRecordsSdf;
import com.chemspider.www.MassSpecAPIStub.SearchByFormulaAsync;
import com.chemspider.www.MassSpecAPIStub.SearchByFormulaAsyncResponse;
import com.chemspider.www.MassSpecAPIStub.SearchByMassAsync;
import com.chemspider.www.MassSpecAPIStub.SearchByMassAsyncResponse;
import com.chemspider.www.SearchStub;
import com.chemspider.www.SearchStub.AsyncSimpleSearch;
import com.chemspider.www.MassSpecAPIStub.GetCompressedRecordsSdf;
import com.chemspider.www.MassSpecAPIStub.GetCompressedRecordsSdfResponse;

public class ChemSpider {
	
	protected String token = "";
	protected Map<String, IAtomContainer> csidToMolecule;
	private static final Logger LOG = Logger.getLogger(ChemSpider.class.getName());
	
	public ChemSpider(String token) {
		this.token = token;
		this.csidToMolecule = new HashMap<String, IAtomContainer>();
	}
	
	/**
	 * Gets Chemspider compound ID's by mass.
	 * 
	 * @param mass the mass
	 * @param error the error
	 * 
	 * @return the chemspider by mass
	 * 
	 * @throws RemoteException the remote exception
	 */
	public Vector<String> getChemspiderByMass(Double mass, Double error) throws RemoteException
	{
		MassSpecAPIStub stub = new MassSpecAPIStub();
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, false);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, 3 * 60 * 1000);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3 * 60 * 1000);
		stub._getServiceClient().getOptions().setCallTransportCleanup(true);
		
		SearchByMassAsync sbma = new SearchByMassAsync();
		
		sbma.setMass(mass);
		sbma.setRange(error);
		sbma.setToken(this.token);
		SearchByMassAsyncResponse sbmar = stub.searchByMassAsync(sbma);
				
		Vector<String> csids = this.downloadCompressedSDF(sbmar.getSearchByMassAsyncResult(), stub);
        
		stub._getServiceClient().cleanupTransport();
		stub.cleanup();
		return csids;
	}
	
	/**
	 * Gets the chemspider by sum formula.
	 * 
	 * @param sumFormula the sum formula
	 * 
	 * @return the chemspider by sum formula
	 * 
	 * @throws RemoteException the remote exception
	 */
	public Vector<String> getChemspiderBySumFormula(String molecularFormula) throws RemoteException
	{ 
		MassSpecAPIStub stub = new MassSpecAPIStub();
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, false);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, 3 * 60 * 1000);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3 * 60 * 1000);
		SearchByFormulaAsync sbfa = new SearchByFormulaAsync();
	    sbfa.setFormula(molecularFormula);
	    sbfa.setToken(this.token);
	    SearchByFormulaAsyncResponse sbfar = stub.searchByFormulaAsync(sbfa);
	
	    Vector<String> csids = this.downloadCompressedSDF(sbfar.getSearchByFormulaAsyncResult(), stub);
	    
		stub._getServiceClient().cleanupTransport();
		stub.cleanup();
		return csids;
	}
	
	/**
	 * 
	 * @param _csids
	 * @param token
	 * @return
	 * @throws RemoteException
	 */
	public Vector<String> getChemSpiderByCsids(String[] _csids) throws RemoteException
	{
		Vector<String> uniqueCsidArray = new Vector<String>();
		for(int i = 0; i < _csids.length; i++) {
			if(!uniqueCsidArray.contains(_csids[i]))
				uniqueCsidArray.add(_csids[i]);
		}
		
		MassSpecAPIStub stub = new MassSpecAPIStub();
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, false);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, 3 * 60 * 1000);
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3 * 60 * 1000);
		Vector<String> csids = new Vector<String>();
	    
		if(uniqueCsidArray.size() == 1) {
			GetRecordMol getRecorMol = new GetRecordMol();
			getRecorMol.setCsid(uniqueCsidArray.get(0));
			getRecorMol.setToken(this.token);
			GetRecordMolResponse grmr = stub.getRecordMol(getRecorMol);
			try {
				Vector<IAtomContainer> cons = this.getAtomContainerFromString(grmr.getGetRecordMolResult());
				csids.add(uniqueCsidArray.get(0));
				this.csidToMolecule.put(uniqueCsidArray.get(0), cons.get(0));
			} catch (CDKException e) {
				e.printStackTrace();
			}
		}
		else {
			AsyncSimpleSearch ass = new AsyncSimpleSearch();
			String query = "";
			if(uniqueCsidArray.size() != 0) query += uniqueCsidArray.get(0);
			for(int i = 1; i < uniqueCsidArray.size(); i++)  
				query += "," + uniqueCsidArray.get(i);
			ass.setQuery(query);
			ass.setToken(this.token);
	        SearchStub thisSearchStub = new SearchStub();
	        thisSearchStub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, false);
	        thisSearchStub._getServiceClient().getOptions().setProperty(HTTPConstants.CONNECTION_TIMEOUT, 3 * 60 * 1000);
	        thisSearchStub._getServiceClient().getOptions().setProperty(HTTPConstants.SO_TIMEOUT, 3 * 60 * 1000);
	        GetRecordsSdf getRecordsSdf = new GetRecordsSdf();
	        getRecordsSdf.setRid(thisSearchStub.asyncSimpleSearch(ass).getAsyncSimpleSearchResult());
	        getRecordsSdf.setToken(this.token);
	      
	        csids = this.downloadCompressedSDF(thisSearchStub.asyncSimpleSearch(ass).getAsyncSimpleSearchResult(), stub);
	    }
		stub._getServiceClient().cleanupTransport();
		stub.cleanup();
		return csids;
	}
	
	/**
	 * 
	 * @param rid
	 * @param stub
	 * @return
	 */
	protected Vector<String> downloadCompressedSDF(String rid, MassSpecAPIStub stub) {
		GetCompressedRecordsSdf getCompressedRecordsSdf = new GetCompressedRecordsSdf();
		getCompressedRecordsSdf.setRid(rid);
		getCompressedRecordsSdf.setToken(this.token);
		getCompressedRecordsSdf.setEComp(ECompression.eGzip);
		GetCompressedRecordsSdfResponse getCompressedRecordsSdfResponse = null;
		javax.activation.DataHandler dh = null;
		try {
			getCompressedRecordsSdfResponse = stub.getCompressedRecordsSdf(getCompressedRecordsSdf);
			dh = getCompressedRecordsSdfResponse.getGetCompressedRecordsSdfResult();
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			System.err.println("Problem retrieving ChemSpider webservices");
		}
		
		Vector<String> csids = new Vector<String>();
        GZIPInputStream gin = null;
        if(dh != null) {
			try {
				gin = new GZIPInputStream(dh.getInputStream());
		        MDLV2000Reader reader = new MDLV2000Reader(gin);
		        ChemFile fileContents = (ChemFile)reader.read(new ChemFile());
		        java.util.List<IAtomContainer> cons = ChemFileManipulator.getAllAtomContainers(fileContents);
		        for(int i = 0; i < cons.size(); i++) {
					String csid = (String)cons.get(i).getProperty("CSID");
					csids.add(csid);
					this.csidToMolecule.put(csid, cons.get(i));
				}
		        reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (CDKException e) {
				e.printStackTrace();
			} catch (Exception e) {
				System.err.println("Problem retrieving ChemSpider webservices");
			}
		}
     	return csids;
	}
	
	/**
	 * 
	 * @param csid
	 * @param getAll
	 * @return
	 * @throws RemoteException
	 * @throws CDKException
	 */
	public synchronized IAtomContainer getMol(String csid) 
			throws RemoteException, CDKException
	{
		return this.csidToMolecule.get(csid);
	}
	
	/**
	 * 
	 * @param sdfString
	 * @return
	 * @throws CDKException
	 */
	protected Vector<IAtomContainer> getAtomContainerFromString(String sdfString) throws CDKException {
		MDLV2000Reader reader = new MDLV2000Reader(new StringReader(sdfString));
		
		java.util.List<IAtomContainer> containersList;
		java.util.Vector<IAtomContainer> ret = new Vector<IAtomContainer>();
		
		ChemFile chemFile = (ChemFile)reader.read((ChemObject)new ChemFile());
        containersList = ChemFileManipulator.getAllAtomContainers(chemFile);
        for (IAtomContainer container: containersList) {
        	ret.add(container);
		}
        try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return ret;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getChemSpiderToken() {
		return this.token;
	}
}
