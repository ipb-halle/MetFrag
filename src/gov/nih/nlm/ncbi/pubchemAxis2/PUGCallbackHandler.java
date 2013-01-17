
/**
 * PUGCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
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
            * auto generated Axis2 call back method for GetIDList method
            * override this method for handling normal response from GetIDList operation
            */
           public void receiveResultGetIDList(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetIDListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetIDList operation
           */
            public void receiveErrorGetIDList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAssayColumnDescription method
            * override this method for handling normal response from GetAssayColumnDescription operation
            */
           public void receiveResultGetAssayColumnDescription(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAssayColumnDescription operation
           */
            public void receiveErrorGetAssayColumnDescription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAssayDescription method
            * override this method for handling normal response from GetAssayDescription operation
            */
           public void receiveResultGetAssayDescription(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayDescriptionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAssayDescription operation
           */
            public void receiveErrorGetAssayDescription(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputStructureBase64 method
            * override this method for handling normal response from InputStructureBase64 operation
            */
           public void receiveResultInputStructureBase64(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructureBase64Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputStructureBase64 operation
           */
            public void receiveErrorInputStructureBase64(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SubstructureSearch method
            * override this method for handling normal response from SubstructureSearch operation
            */
           public void receiveResultSubstructureSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.SubstructureSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SubstructureSearch operation
           */
            public void receiveErrorSubstructureSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SimilaritySearch2D method
            * override this method for handling normal response from SimilaritySearch2D operation
            */
           public void receiveResultSimilaritySearch2D(
                    gov.nih.nlm.ncbi.pubchemAxis2.SimilaritySearch2DResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SimilaritySearch2D operation
           */
            public void receiveErrorSimilaritySearch2D(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetStandardizedStructureBase64 method
            * override this method for handling normal response from GetStandardizedStructureBase64 operation
            */
           public void receiveResultGetStandardizedStructureBase64(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureBase64Response result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetStandardizedStructureBase64 operation
           */
            public void receiveErrorGetStandardizedStructureBase64(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for IdentitySearch method
            * override this method for handling normal response from IdentitySearch operation
            */
           public void receiveResultIdentitySearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.IdentitySearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from IdentitySearch operation
           */
            public void receiveErrorIdentitySearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetListItemsCount method
            * override this method for handling normal response from GetListItemsCount operation
            */
           public void receiveResultGetListItemsCount(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetListItemsCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetListItemsCount operation
           */
            public void receiveErrorGetListItemsCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetEntrezKey method
            * override this method for handling normal response from GetEntrezKey operation
            */
           public void receiveResultGetEntrezKey(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezKeyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetEntrezKey operation
           */
            public void receiveErrorGetEntrezKey(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputAssay method
            * override this method for handling normal response from InputAssay operation
            */
           public void receiveResultInputAssay(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputAssayResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputAssay operation
           */
            public void receiveErrorInputAssay(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputList method
            * override this method for handling normal response from InputList operation
            */
           public void receiveResultInputList(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputList operation
           */
            public void receiveErrorInputList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for MFSearch method
            * override this method for handling normal response from MFSearch operation
            */
           public void receiveResultMFSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.MFSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from MFSearch operation
           */
            public void receiveErrorMFSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetStandardizedStructure method
            * override this method for handling normal response from GetStandardizedStructure operation
            */
           public void receiveResultGetStandardizedStructure(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedStructureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetStandardizedStructure operation
           */
            public void receiveErrorGetStandardizedStructure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetStatusMessage method
            * override this method for handling normal response from GetStatusMessage operation
            */
           public void receiveResultGetStatusMessage(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStatusMessageResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetStatusMessage operation
           */
            public void receiveErrorGetStatusMessage(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputEntrez method
            * override this method for handling normal response from InputEntrez operation
            */
           public void receiveResultInputEntrez(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputEntrezResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputEntrez operation
           */
            public void receiveErrorInputEntrez(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for Download method
            * override this method for handling normal response from Download operation
            */
           public void receiveResultDownload(
                    gov.nih.nlm.ncbi.pubchemAxis2.DownloadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from Download operation
           */
            public void receiveErrorDownload(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetDownloadUrl method
            * override this method for handling normal response from GetDownloadUrl operation
            */
           public void receiveResultGetDownloadUrl(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetDownloadUrlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetDownloadUrl operation
           */
            public void receiveErrorGetDownloadUrl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputStructure method
            * override this method for handling normal response from InputStructure operation
            */
           public void receiveResultInputStructure(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputStructureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputStructure operation
           */
            public void receiveErrorInputStructure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetOperationStatus method
            * override this method for handling normal response from GetOperationStatus operation
            */
           public void receiveResultGetOperationStatus(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetOperationStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetOperationStatus operation
           */
            public void receiveErrorGetOperationStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputListText method
            * override this method for handling normal response from InputListText operation
            */
           public void receiveResultInputListText(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListTextResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputListText operation
           */
            public void receiveErrorInputListText(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetEntrezUrl method
            * override this method for handling normal response from GetEntrezUrl operation
            */
           public void receiveResultGetEntrezUrl(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetEntrezUrlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetEntrezUrl operation
           */
            public void receiveErrorGetEntrezUrl(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for InputListString method
            * override this method for handling normal response from InputListString operation
            */
           public void receiveResultInputListString(
                    gov.nih.nlm.ncbi.pubchemAxis2.InputListStringResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from InputListString operation
           */
            public void receiveErrorInputListString(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for IDExchange method
            * override this method for handling normal response from IDExchange operation
            */
           public void receiveResultIDExchange(
                    gov.nih.nlm.ncbi.pubchemAxis2.IDExchangeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from IDExchange operation
           */
            public void receiveErrorIDExchange(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for Standardize method
            * override this method for handling normal response from Standardize operation
            */
           public void receiveResultStandardize(
                    gov.nih.nlm.ncbi.pubchemAxis2.StandardizeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from Standardize operation
           */
            public void receiveErrorStandardize(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetAssayColumnDescriptions method
            * override this method for handling normal response from GetAssayColumnDescriptions operation
            */
           public void receiveResultGetAssayColumnDescriptions(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetAssayColumnDescriptionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetAssayColumnDescriptions operation
           */
            public void receiveErrorGetAssayColumnDescriptions(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for GetStandardizedCID method
            * override this method for handling normal response from GetStandardizedCID operation
            */
           public void receiveResultGetStandardizedCID(
                    gov.nih.nlm.ncbi.pubchemAxis2.GetStandardizedCIDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from GetStandardizedCID operation
           */
            public void receiveErrorGetStandardizedCID(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for AssayDownload method
            * override this method for handling normal response from AssayDownload operation
            */
           public void receiveResultAssayDownload(
                    gov.nih.nlm.ncbi.pubchemAxis2.AssayDownloadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from AssayDownload operation
           */
            public void receiveErrorAssayDownload(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for SuperstructureSearch method
            * override this method for handling normal response from SuperstructureSearch operation
            */
           public void receiveResultSuperstructureSearch(
                    gov.nih.nlm.ncbi.pubchemAxis2.SuperstructureSearchResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from SuperstructureSearch operation
           */
            public void receiveErrorSuperstructureSearch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for ScoreMatrix method
            * override this method for handling normal response from ScoreMatrix operation
            */
           public void receiveResultScoreMatrix(
                    gov.nih.nlm.ncbi.pubchemAxis2.ScoreMatrixResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ScoreMatrix operation
           */
            public void receiveErrorScoreMatrix(java.lang.Exception e) {
            }
                


    }
    