
/**
 * AssayDescriptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.pubchemAxis2;
            

            /**
            *  AssayDescriptionType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AssayDescriptionType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AssayDescriptionType
                Namespace URI = http://pubchem.ncbi.nlm.nih.gov/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;

                           public boolean isNameSpecified(){
                               return localNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            localNameTracker = param != null;
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString localDescription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionTracker = false ;

                           public boolean isDescriptionSpecified(){
                               return localDescriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2Axis2.ArrayOfString
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString param){
                            localDescriptionTracker = param != null;
                                   
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for Protocol
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString localProtocol ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProtocolTracker = false ;

                           public boolean isProtocolSpecified(){
                               return localProtocolTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString getProtocol(){
                               return localProtocol;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Protocol
                               */
                               public void setProtocol(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString param){
                            localProtocolTracker = param != null;
                                   
                                            this.localProtocol=param;
                                    

                               }
                            

                        /**
                        * field for Comment
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString localComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentTracker = false ;

                           public boolean isCommentSpecified(){
                               return localCommentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString getComment(){
                               return localComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comment
                               */
                               public void setComment(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString param){
                            localCommentTracker = param != null;
                                   
                                            this.localComment=param;
                                    

                               }
                            

                        /**
                        * field for NumberOfTIDs
                        */

                        
                                    protected int localNumberOfTIDs ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfTIDs(){
                               return localNumberOfTIDs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfTIDs
                               */
                               public void setNumberOfTIDs(int param){
                            
                                            this.localNumberOfTIDs=param;
                                    

                               }
                            

                        /**
                        * field for HasScore
                        */

                        
                                    protected boolean localHasScore ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasScore(){
                               return localHasScore;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasScore
                               */
                               public void setHasScore(boolean param){
                            
                                            this.localHasScore=param;
                                    

                               }
                            

                        /**
                        * field for Method
                        */

                        
                                    protected java.lang.String localMethod ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMethodTracker = false ;

                           public boolean isMethodSpecified(){
                               return localMethodTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMethod(){
                               return localMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Method
                               */
                               public void setMethod(java.lang.String param){
                            localMethodTracker = param != null;
                                   
                                            this.localMethod=param;
                                    

                               }
                            

                        /**
                        * field for Targets
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfTargets localTargets ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTargetsTracker = false ;

                           public boolean isTargetsSpecified(){
                               return localTargetsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfTargets
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfTargets getTargets(){
                               return localTargets;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Targets
                               */
                               public void setTargets(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfTargets param){
                            localTargetsTracker = param != null;
                                   
                                            this.localTargets=param;
                                    

                               }
                            

                        /**
                        * field for Version
                        */

                        
                                    protected int localVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVersionTracker = false ;

                           public boolean isVersionSpecified(){
                               return localVersionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getVersion(){
                               return localVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Version
                               */
                               public void setVersion(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localVersionTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localVersion=param;
                                    

                               }
                            

                        /**
                        * field for Revision
                        */

                        
                                    protected int localRevision ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRevisionTracker = false ;

                           public boolean isRevisionSpecified(){
                               return localRevisionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRevision(){
                               return localRevision;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Revision
                               */
                               public void setRevision(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localRevisionTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localRevision=param;
                                    

                               }
                            

                        /**
                        * field for LastDataChange
                        */

                        
                                    protected int localLastDataChange ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastDataChangeTracker = false ;

                           public boolean isLastDataChangeSpecified(){
                               return localLastDataChangeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getLastDataChange(){
                               return localLastDataChange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastDataChange
                               */
                               public void setLastDataChange(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localLastDataChangeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localLastDataChange=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountAll
                        */

                        
                                    protected int localSIDCountAll ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountAllTracker = false ;

                           public boolean isSIDCountAllSpecified(){
                               return localSIDCountAllTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountAll(){
                               return localSIDCountAll;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountAll
                               */
                               public void setSIDCountAll(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountAllTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountAll=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountActive
                        */

                        
                                    protected int localSIDCountActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountActiveTracker = false ;

                           public boolean isSIDCountActiveSpecified(){
                               return localSIDCountActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountActive(){
                               return localSIDCountActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountActive
                               */
                               public void setSIDCountActive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountActiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountActive=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountInactive
                        */

                        
                                    protected int localSIDCountInactive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountInactiveTracker = false ;

                           public boolean isSIDCountInactiveSpecified(){
                               return localSIDCountInactiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountInactive(){
                               return localSIDCountInactive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountInactive
                               */
                               public void setSIDCountInactive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountInactiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountInactive=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountInconclusive
                        */

                        
                                    protected int localSIDCountInconclusive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountInconclusiveTracker = false ;

                           public boolean isSIDCountInconclusiveSpecified(){
                               return localSIDCountInconclusiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountInconclusive(){
                               return localSIDCountInconclusive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountInconclusive
                               */
                               public void setSIDCountInconclusive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountInconclusiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountInconclusive=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountUnspecified
                        */

                        
                                    protected int localSIDCountUnspecified ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountUnspecifiedTracker = false ;

                           public boolean isSIDCountUnspecifiedSpecified(){
                               return localSIDCountUnspecifiedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountUnspecified(){
                               return localSIDCountUnspecified;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountUnspecified
                               */
                               public void setSIDCountUnspecified(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountUnspecifiedTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountUnspecified=param;
                                    

                               }
                            

                        /**
                        * field for SIDCountProbe
                        */

                        
                                    protected int localSIDCountProbe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSIDCountProbeTracker = false ;

                           public boolean isSIDCountProbeSpecified(){
                               return localSIDCountProbeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSIDCountProbe(){
                               return localSIDCountProbe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SIDCountProbe
                               */
                               public void setSIDCountProbe(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localSIDCountProbeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localSIDCountProbe=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountAll
                        */

                        
                                    protected int localCIDCountAll ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountAllTracker = false ;

                           public boolean isCIDCountAllSpecified(){
                               return localCIDCountAllTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountAll(){
                               return localCIDCountAll;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountAll
                               */
                               public void setCIDCountAll(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountAllTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountAll=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountActive
                        */

                        
                                    protected int localCIDCountActive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountActiveTracker = false ;

                           public boolean isCIDCountActiveSpecified(){
                               return localCIDCountActiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountActive(){
                               return localCIDCountActive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountActive
                               */
                               public void setCIDCountActive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountActiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountActive=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountInactive
                        */

                        
                                    protected int localCIDCountInactive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountInactiveTracker = false ;

                           public boolean isCIDCountInactiveSpecified(){
                               return localCIDCountInactiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountInactive(){
                               return localCIDCountInactive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountInactive
                               */
                               public void setCIDCountInactive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountInactiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountInactive=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountInconclusive
                        */

                        
                                    protected int localCIDCountInconclusive ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountInconclusiveTracker = false ;

                           public boolean isCIDCountInconclusiveSpecified(){
                               return localCIDCountInconclusiveTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountInconclusive(){
                               return localCIDCountInconclusive;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountInconclusive
                               */
                               public void setCIDCountInconclusive(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountInconclusiveTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountInconclusive=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountUnspecified
                        */

                        
                                    protected int localCIDCountUnspecified ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountUnspecifiedTracker = false ;

                           public boolean isCIDCountUnspecifiedSpecified(){
                               return localCIDCountUnspecifiedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountUnspecified(){
                               return localCIDCountUnspecified;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountUnspecified
                               */
                               public void setCIDCountUnspecified(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountUnspecifiedTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountUnspecified=param;
                                    

                               }
                            

                        /**
                        * field for CIDCountProbe
                        */

                        
                                    protected int localCIDCountProbe ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCIDCountProbeTracker = false ;

                           public boolean isCIDCountProbeSpecified(){
                               return localCIDCountProbeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getCIDCountProbe(){
                               return localCIDCountProbe;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CIDCountProbe
                               */
                               public void setCIDCountProbe(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localCIDCountProbeTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localCIDCountProbe=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://pubchem.ncbi.nlm.nih.gov/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AssayDescriptionType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AssayDescriptionType",
                           xmlWriter);
                   }

               
                   }
                if (localNameTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "Name", xmlWriter);
                             

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionTracker){
                                            if (localDescription==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                            }
                                            localDescription.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Description"),
                                               xmlWriter);
                                        } if (localProtocolTracker){
                                            if (localProtocol==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Protocol cannot be null!!");
                                            }
                                           localProtocol.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Protocol"),
                                               xmlWriter);
                                        } if (localCommentTracker){
                                            if (localComment==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");
                                            }
                                           localComment.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Comment"),
                                               xmlWriter);
                                        }
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "NumberOfTIDs", xmlWriter);
                             
                                               if (localNumberOfTIDs==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfTIDs cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfTIDs));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "HasScore", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("HasScore cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasScore));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localMethodTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "Method", xmlWriter);
                             

                                          if (localMethod==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Method cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMethod);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTargetsTracker){
                                            if (localTargets==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Targets cannot be null!!");
                                            }
                                           localTargets.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Targets"),
                                               xmlWriter);
                                        } if (localVersionTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "Version", xmlWriter);
                             
                                               if (localVersion==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Version cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRevisionTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "Revision", xmlWriter);
                             
                                               if (localRevision==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Revision cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevision));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastDataChangeTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "LastDataChange", xmlWriter);
                             
                                               if (localLastDataChange==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("LastDataChange cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastDataChange));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountAllTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountAll", xmlWriter);
                             
                                               if (localSIDCountAll==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountAll cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountAll));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountActiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountActive", xmlWriter);
                             
                                               if (localSIDCountActive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountActive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountActive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountInactiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountInactive", xmlWriter);
                             
                                               if (localSIDCountInactive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountInactive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountInactive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountInconclusiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountInconclusive", xmlWriter);
                             
                                               if (localSIDCountInconclusive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountInconclusive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountInconclusive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountUnspecifiedTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountUnspecified", xmlWriter);
                             
                                               if (localSIDCountUnspecified==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountUnspecified cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountUnspecified));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSIDCountProbeTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SIDCountProbe", xmlWriter);
                             
                                               if (localSIDCountProbe==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("SIDCountProbe cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountProbe));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountAllTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountAll", xmlWriter);
                             
                                               if (localCIDCountAll==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountAll cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountAll));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountActiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountActive", xmlWriter);
                             
                                               if (localCIDCountActive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountActive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountActive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountInactiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountInactive", xmlWriter);
                             
                                               if (localCIDCountInactive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountInactive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountInactive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountInconclusiveTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountInconclusive", xmlWriter);
                             
                                               if (localCIDCountInconclusive==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountInconclusive cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountInconclusive));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountUnspecifiedTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountUnspecified", xmlWriter);
                             
                                               if (localCIDCountUnspecified==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountUnspecified cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountUnspecified));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCIDCountProbeTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "CIDCountProbe", xmlWriter);
                             
                                               if (localCIDCountProbe==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("CIDCountProbe cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountProbe));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://pubchem.ncbi.nlm.nih.gov/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Name"));
                                 
                                        if (localName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");
                                        }
                                    } if (localDescriptionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Description"));
                            
                            
                                    if (localDescription==null){
                                         throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");
                                    }
                                    elementList.add(localDescription);
                                } if (localProtocolTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Protocol"));
                            
                            
                                    if (localProtocol==null){
                                         throw new org.apache.axis2.databinding.ADBException("Protocol cannot be null!!");
                                    }
                                    elementList.add(localProtocol);
                                } if (localCommentTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Comment"));
                            
                            
                                    if (localComment==null){
                                         throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");
                                    }
                                    elementList.add(localComment);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "NumberOfTIDs"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfTIDs));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "HasScore"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasScore));
                             if (localMethodTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Method"));
                                 
                                        if (localMethod != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMethod));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Method cannot be null!!");
                                        }
                                    } if (localTargetsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Targets"));
                            
                            
                                    if (localTargets==null){
                                         throw new org.apache.axis2.databinding.ADBException("Targets cannot be null!!");
                                    }
                                    elementList.add(localTargets);
                                } if (localVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Version"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));
                            } if (localRevisionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Revision"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevision));
                            } if (localLastDataChangeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "LastDataChange"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastDataChange));
                            } if (localSIDCountAllTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountAll"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountAll));
                            } if (localSIDCountActiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountActive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountActive));
                            } if (localSIDCountInactiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountInactive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountInactive));
                            } if (localSIDCountInconclusiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountInconclusive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountInconclusive));
                            } if (localSIDCountUnspecifiedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountUnspecified"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountUnspecified));
                            } if (localSIDCountProbeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SIDCountProbe"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSIDCountProbe));
                            } if (localCIDCountAllTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountAll"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountAll));
                            } if (localCIDCountActiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountActive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountActive));
                            } if (localCIDCountInactiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountInactive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountInactive));
                            } if (localCIDCountInconclusiveTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountInconclusive"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountInconclusive));
                            } if (localCIDCountUnspecifiedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountUnspecified"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountUnspecified));
                            } if (localCIDCountProbeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "CIDCountProbe"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCIDCountProbe));
                            }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static AssayDescriptionType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AssayDescriptionType object =
                new AssayDescriptionType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"AssayDescriptionType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AssayDescriptionType)gov.nih.nlm.ncbi.pubchemAxis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Name").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Name" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Description").equals(reader.getName())){
                                
                                                object.setDescription(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Protocol").equals(reader.getName())){
                                
                                                object.setProtocol(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Comment").equals(reader.getName())){
                                
                                                object.setComment(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfString.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","NumberOfTIDs").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfTIDs" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfTIDs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","HasScore").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"HasScore" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHasScore(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Method").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Method" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMethod(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Targets").equals(reader.getName())){
                                
                                                object.setTargets(gov.nih.nlm.ncbi.pubchemAxis2.ArrayOfTargets.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Version").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Version" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setVersion(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Revision").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"Revision" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRevision(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRevision(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","LastDataChange").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LastDataChange" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastDataChange(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setLastDataChange(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountAll").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountAll" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountAll(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountAll(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountActive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountActive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountActive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountInactive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountInactive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountInactive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountInactive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountInconclusive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountInconclusive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountInconclusive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountInconclusive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountUnspecified").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountUnspecified" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountUnspecified(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountUnspecified(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SIDCountProbe").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SIDCountProbe" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSIDCountProbe(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSIDCountProbe(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountAll").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountAll" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountAll(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountAll(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountActive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountActive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountActive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountActive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountInactive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountInactive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountInactive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountInactive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountInconclusive").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountInconclusive" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountInconclusive(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountInconclusive(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountUnspecified").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountUnspecified" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountUnspecified(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountUnspecified(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","CIDCountProbe").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CIDCountProbe" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCIDCountProbe(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setCIDCountProbe(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    