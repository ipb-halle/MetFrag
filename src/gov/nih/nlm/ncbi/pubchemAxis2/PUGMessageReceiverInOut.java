
/**
 * PUGMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package gov.nih.nlm.ncbi.pubchemAxis2;

        /**
        *  PUGMessageReceiverInOut message receiver
        */

        public class PUGMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PUGSkeleton skel = (PUGSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getIDList".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse getIDListResponse1 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetIDList wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetIDList)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetIDList.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getIDListResponse1 =
                                                   
                                                   
                                                         skel.getIDList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getIDListResponse1, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getIDList"));
                                    } else 

            if("getAssayColumnDescription".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse getAssayColumnDescriptionResponse3 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAssayColumnDescriptionResponse3 =
                                                   
                                                   
                                                         skel.getAssayColumnDescription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAssayColumnDescriptionResponse3, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getAssayColumnDescription"));
                                    } else 

            if("getAssayDescription".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse getAssayDescriptionResponse5 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAssayDescriptionResponse5 =
                                                   
                                                   
                                                         skel.getAssayDescription(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAssayDescriptionResponse5, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getAssayDescription"));
                                    } else 

            if("inputStructureBase64".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response inputStructureBase64Response7 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64 wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputStructureBase64Response7 =
                                                   
                                                   
                                                         skel.inputStructureBase64(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputStructureBase64Response7, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputStructureBase64"));
                                    } else 

            if("substructureSearch".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse substructureSearchResponse9 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               substructureSearchResponse9 =
                                                   
                                                   
                                                         skel.substructureSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), substructureSearchResponse9, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "substructureSearch"));
                                    } else 

            if("similaritySearch2D".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse similaritySearch2DResponse11 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               similaritySearch2DResponse11 =
                                                   
                                                   
                                                         skel.similaritySearch2D(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), similaritySearch2DResponse11, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "similaritySearch2D"));
                                    } else 

            if("getStandardizedStructureBase64".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response getStandardizedStructureBase64Response13 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64 wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getStandardizedStructureBase64Response13 =
                                                   
                                                   
                                                         skel.getStandardizedStructureBase64(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getStandardizedStructureBase64Response13, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getStandardizedStructureBase64"));
                                    } else 

            if("identitySearch".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse identitySearchResponse15 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               identitySearchResponse15 =
                                                   
                                                   
                                                         skel.identitySearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), identitySearchResponse15, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "identitySearch"));
                                    } else 

            if("getListItemsCount".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse getListItemsCountResponse17 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getListItemsCountResponse17 =
                                                   
                                                   
                                                         skel.getListItemsCount(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getListItemsCountResponse17, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getListItemsCount"));
                                    } else 

            if("getEntrezKey".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse getEntrezKeyResponse19 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntrezKeyResponse19 =
                                                   
                                                   
                                                         skel.getEntrezKey(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntrezKeyResponse19, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getEntrezKey"));
                                    } else 

            if("inputAssay".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse inputAssayResponse21 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputAssay wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputAssay)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputAssay.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputAssayResponse21 =
                                                   
                                                   
                                                         skel.inputAssay(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputAssayResponse21, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputAssay"));
                                    } else 

            if("getStandardizedStructure".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse getStandardizedStructureResponse23 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getStandardizedStructureResponse23 =
                                                   
                                                   
                                                         skel.getStandardizedStructure(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getStandardizedStructureResponse23, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getStandardizedStructure"));
                                    } else 

            if("inputList".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse inputListResponse25 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputList wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputList)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputList.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputListResponse25 =
                                                   
                                                   
                                                         skel.inputList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputListResponse25, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputList"));
                                    } else 

            if("mFSearch".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse mFSearchResponse27 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.MFSearch wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.MFSearch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.MFSearch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               mFSearchResponse27 =
                                                   
                                                   
                                                         skel.mFSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), mFSearchResponse27, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "mFSearch"));
                                    } else 

            if("getStatusMessage".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse getStatusMessageResponse29 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getStatusMessageResponse29 =
                                                   
                                                   
                                                         skel.getStatusMessage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getStatusMessageResponse29, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getStatusMessage"));
                                    } else 

            if("inputEntrez".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse inputEntrezResponse31 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputEntrezResponse31 =
                                                   
                                                   
                                                         skel.inputEntrez(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputEntrezResponse31, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputEntrez"));
                                    } else 

            if("download".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse downloadResponse33 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.Download wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.Download)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.Download.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               downloadResponse33 =
                                                   
                                                   
                                                         skel.download(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), downloadResponse33, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "download"));
                                    } else 

            if("getDownloadUrl".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse getDownloadUrlResponse35 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDownloadUrlResponse35 =
                                                   
                                                   
                                                         skel.getDownloadUrl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDownloadUrlResponse35, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getDownloadUrl"));
                                    } else 

            if("inputStructure".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse inputStructureResponse37 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputStructure wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputStructure)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructure.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputStructureResponse37 =
                                                   
                                                   
                                                         skel.inputStructure(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputStructureResponse37, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputStructure"));
                                    } else 

            if("getOperationStatus".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse getOperationStatusResponse39 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOperationStatusResponse39 =
                                                   
                                                   
                                                         skel.getOperationStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOperationStatusResponse39, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getOperationStatus"));
                                    } else 

            if("inputListText".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse inputListTextResponse41 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputListText wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputListText)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputListText.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputListTextResponse41 =
                                                   
                                                   
                                                         skel.inputListText(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputListTextResponse41, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputListText"));
                                    } else 

            if("getEntrezUrl".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse getEntrezUrlResponse43 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getEntrezUrlResponse43 =
                                                   
                                                   
                                                         skel.getEntrezUrl(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getEntrezUrlResponse43, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getEntrezUrl"));
                                    } else 

            if("inputListString".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse inputListStringResponse45 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.InputListString wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.InputListString)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.InputListString.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               inputListStringResponse45 =
                                                   
                                                   
                                                         skel.inputListString(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), inputListStringResponse45, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "inputListString"));
                                    } else 

            if("iDExchange".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse iDExchangeResponse47 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.IDExchange wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.IDExchange)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.IDExchange.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               iDExchangeResponse47 =
                                                   
                                                   
                                                         skel.iDExchange(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), iDExchangeResponse47, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "iDExchange"));
                                    } else 

            if("standardize".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse standardizeResponse49 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.Standardize wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.Standardize)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.Standardize.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               standardizeResponse49 =
                                                   
                                                   
                                                         skel.standardize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), standardizeResponse49, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "standardize"));
                                    } else 

            if("getAssayColumnDescriptions".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse getAssayColumnDescriptionsResponse51 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAssayColumnDescriptionsResponse51 =
                                                   
                                                   
                                                         skel.getAssayColumnDescriptions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAssayColumnDescriptionsResponse51, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getAssayColumnDescriptions"));
                                    } else 

            if("getStandardizedCID".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse getStandardizedCIDResponse53 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getStandardizedCIDResponse53 =
                                                   
                                                   
                                                         skel.getStandardizedCID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getStandardizedCIDResponse53, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "getStandardizedCID"));
                                    } else 

            if("assayDownload".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse assayDownloadResponse55 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               assayDownloadResponse55 =
                                                   
                                                   
                                                         skel.assayDownload(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), assayDownloadResponse55, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "assayDownload"));
                                    } else 

            if("superstructureSearch".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse superstructureSearchResponse57 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               superstructureSearchResponse57 =
                                                   
                                                   
                                                         skel.superstructureSearch(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), superstructureSearchResponse57, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "superstructureSearch"));
                                    } else 

            if("scoreMatrix".equals(methodName)){
                
                gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse scoreMatrixResponse59 = null;
	                        gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix wrappedParam =
                                                             (gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               scoreMatrixResponse59 =
                                                   
                                                   
                                                         skel.scoreMatrix(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), scoreMatrixResponse59, false, new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                    "scoreMatrix"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetIDList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetIDList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64 param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputAssay param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputAssay.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.MFSearch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.MFSearch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.Download param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.Download.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputStructure param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructure.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputListText param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListText.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputListString param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListString.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.IDExchange param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IDExchange.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.Standardize param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.Standardize.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse wrapGetIDList(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse wrapGetAssayColumnDescription(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse wrapGetAssayDescription(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response wrapInputStructureBase64(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse wrapSubstructureSearch(){
                                gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse wrapSimilaritySearch2D(){
                                gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response wrapGetStandardizedStructureBase64(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse wrapIdentitySearch(){
                                gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse wrapGetListItemsCount(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse wrapGetEntrezKey(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse wrapInputAssay(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse wrapGetStandardizedStructure(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse wrapInputList(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse wrapMFSearch(){
                                gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse wrapGetStatusMessage(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse wrapInputEntrez(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse wrapDownload(){
                                gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse wrapGetDownloadUrl(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse wrapInputStructure(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse wrapGetOperationStatus(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse wrapInputListText(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse wrapGetEntrezUrl(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse wrapInputListString(){
                                gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse wrapIDExchange(){
                                gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse wrapStandardize(){
                                gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse wrapGetAssayColumnDescriptions(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse wrapGetStandardizedCID(){
                                gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse wrapAssayDownload(){
                                gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse wrapSuperstructureSearch(){
                                gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse wrapScoreMatrix(){
                                gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse wrappedElement = new gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetIDList.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetIDList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2D.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCount.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKey.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputAssay.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputAssay.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructure.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputList.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.MFSearch.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.MFSearch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputEntrez.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.Download.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.Download.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputStructure.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputStructure.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputListText.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputListText.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrl.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputListString.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputListString.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.IDExchange.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.IDExchange.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.Standardize.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.Standardize.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCID.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.AssayDownload.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearch.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrix.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse.class.equals(type)){
                
                           return gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    