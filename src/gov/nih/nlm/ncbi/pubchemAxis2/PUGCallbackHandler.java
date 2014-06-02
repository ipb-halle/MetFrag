
/**
 * PUGCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package gov.nih.nlm.ncbi.pubchemAxis2;

    /**
     *  PUGCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PUGCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PUGCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PUGCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getIDList method
            * override this method for handling normal response from getIDList operation
            */
           public void receiveResultgetIDList(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIDList operation
           */
            public void receiveErrorgetIDList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAssayColumnDescription method
            * override this method for handling normal response from getAssayColumnDescription operation
            */
           public void receiveResultgetAssayColumnDescription(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAssayColumnDescription operation
           */
            public void receiveErrorgetAssayColumnDescription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAssayDescription method
            * override this method for handling normal response from getAssayDescription operation
            */
           public void receiveResultgetAssayDescription(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAssayDescription operation
           */
            public void receiveErrorgetAssayDescription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputStructureBase64 method
            * override this method for handling normal response from inputStructureBase64 operation
            */
           public void receiveResultinputStructureBase64(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputStructureBase64 operation
           */
            public void receiveErrorinputStructureBase64(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for substructureSearch method
            * override this method for handling normal response from substructureSearch operation
            */
           public void receiveResultsubstructureSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from substructureSearch operation
           */
            public void receiveErrorsubstructureSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for similaritySearch2D method
            * override this method for handling normal response from similaritySearch2D operation
            */
           public void receiveResultsimilaritySearch2D(
                    gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from similaritySearch2D operation
           */
            public void receiveErrorsimilaritySearch2D(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStandardizedStructureBase64 method
            * override this method for handling normal response from getStandardizedStructureBase64 operation
            */
           public void receiveResultgetStandardizedStructureBase64(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStandardizedStructureBase64 operation
           */
            public void receiveErrorgetStandardizedStructureBase64(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for identitySearch method
            * override this method for handling normal response from identitySearch operation
            */
           public void receiveResultidentitySearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from identitySearch operation
           */
            public void receiveErroridentitySearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getListItemsCount method
            * override this method for handling normal response from getListItemsCount operation
            */
           public void receiveResultgetListItemsCount(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getListItemsCount operation
           */
            public void receiveErrorgetListItemsCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getEntrezKey method
            * override this method for handling normal response from getEntrezKey operation
            */
           public void receiveResultgetEntrezKey(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getEntrezKey operation
           */
            public void receiveErrorgetEntrezKey(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputAssay method
            * override this method for handling normal response from inputAssay operation
            */
           public void receiveResultinputAssay(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputAssay operation
           */
            public void receiveErrorinputAssay(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStandardizedStructure method
            * override this method for handling normal response from getStandardizedStructure operation
            */
           public void receiveResultgetStandardizedStructure(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStandardizedStructure operation
           */
            public void receiveErrorgetStandardizedStructure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputList method
            * override this method for handling normal response from inputList operation
            */
           public void receiveResultinputList(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputList operation
           */
            public void receiveErrorinputList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mFSearch method
            * override this method for handling normal response from mFSearch operation
            */
           public void receiveResultmFSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mFSearch operation
           */
            public void receiveErrormFSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStatusMessage method
            * override this method for handling normal response from getStatusMessage operation
            */
           public void receiveResultgetStatusMessage(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStatusMessage operation
           */
            public void receiveErrorgetStatusMessage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputEntrez method
            * override this method for handling normal response from inputEntrez operation
            */
           public void receiveResultinputEntrez(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputEntrez operation
           */
            public void receiveErrorinputEntrez(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for download method
            * override this method for handling normal response from download operation
            */
           public void receiveResultdownload(
                    gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from download operation
           */
            public void receiveErrordownload(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDownloadUrl method
            * override this method for handling normal response from getDownloadUrl operation
            */
           public void receiveResultgetDownloadUrl(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDownloadUrl operation
           */
            public void receiveErrorgetDownloadUrl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputStructure method
            * override this method for handling normal response from inputStructure operation
            */
           public void receiveResultinputStructure(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputStructure operation
           */
            public void receiveErrorinputStructure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOperationStatus method
            * override this method for handling normal response from getOperationStatus operation
            */
           public void receiveResultgetOperationStatus(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOperationStatus operation
           */
            public void receiveErrorgetOperationStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputListText method
            * override this method for handling normal response from inputListText operation
            */
           public void receiveResultinputListText(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputListText operation
           */
            public void receiveErrorinputListText(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getEntrezUrl method
            * override this method for handling normal response from getEntrezUrl operation
            */
           public void receiveResultgetEntrezUrl(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getEntrezUrl operation
           */
            public void receiveErrorgetEntrezUrl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inputListString method
            * override this method for handling normal response from inputListString operation
            */
           public void receiveResultinputListString(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inputListString operation
           */
            public void receiveErrorinputListString(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for iDExchange method
            * override this method for handling normal response from iDExchange operation
            */
           public void receiveResultiDExchange(
                    gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from iDExchange operation
           */
            public void receiveErroriDExchange(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for standardize method
            * override this method for handling normal response from standardize operation
            */
           public void receiveResultstandardize(
                    gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from standardize operation
           */
            public void receiveErrorstandardize(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAssayColumnDescriptions method
            * override this method for handling normal response from getAssayColumnDescriptions operation
            */
           public void receiveResultgetAssayColumnDescriptions(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAssayColumnDescriptions operation
           */
            public void receiveErrorgetAssayColumnDescriptions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStandardizedCID method
            * override this method for handling normal response from getStandardizedCID operation
            */
           public void receiveResultgetStandardizedCID(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStandardizedCID operation
           */
            public void receiveErrorgetStandardizedCID(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for assayDownload method
            * override this method for handling normal response from assayDownload operation
            */
           public void receiveResultassayDownload(
                    gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from assayDownload operation
           */
            public void receiveErrorassayDownload(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for superstructureSearch method
            * override this method for handling normal response from superstructureSearch operation
            */
           public void receiveResultsuperstructureSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from superstructureSearch operation
           */
            public void receiveErrorsuperstructureSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for scoreMatrix method
            * override this method for handling normal response from scoreMatrix operation
            */
           public void receiveResultscoreMatrix(
                    gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from scoreMatrix operation
           */
            public void receiveErrorscoreMatrix(java.lang.Exception e) {
            }
                


    }
    