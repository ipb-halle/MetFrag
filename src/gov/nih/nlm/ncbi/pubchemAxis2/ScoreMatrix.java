
/**
 * ScoreMatrix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.pubchemAxis2;
            

            /**
            *  ScoreMatrix bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ScoreMatrix
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://pubchem.ncbi.nlm.nih.gov/",
                "ScoreMatrix",
                "ns1");

            

                        /**
                        * field for ListKey
                        */

                        
                                    protected java.lang.String localListKey ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getListKey(){
                               return localListKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ListKey
                               */
                               public void setListKey(java.lang.String param){
                            
                                            this.localListKey=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryListKey
                        */

                        
                                    protected java.lang.String localSecondaryListKey ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryListKeyTracker = false ;

                           public boolean isSecondaryListKeySpecified(){
                               return localSecondaryListKeyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryListKey(){
                               return localSecondaryListKey;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryListKey
                               */
                               public void setSecondaryListKey(java.lang.String param){
                            localSecondaryListKeyTracker = param != null;
                                   
                                            this.localSecondaryListKey=param;
                                    

                               }
                            

                        /**
                        * field for ScoreType
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.ScoreTypeType localScoreType ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.ScoreTypeType
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.ScoreTypeType getScoreType(){
                               return localScoreType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ScoreType
                               */
                               public void setScoreType(gov.nih.nlm.ncbi.pubchemAxis2.ScoreTypeType param){
                            
                                            this.localScoreType=param;
                                    

                               }
                            

                        /**
                        * field for MatrixFormat
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.MatrixFormatType localMatrixFormat ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.MatrixFormatType
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.MatrixFormatType getMatrixFormat(){
                               return localMatrixFormat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatrixFormat
                               */
                               public void setMatrixFormat(gov.nih.nlm.ncbi.pubchemAxis2.MatrixFormatType param){
                            
                                            this.localMatrixFormat=param;
                                    

                               }
                            

                        /**
                        * field for ECompress
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.CompressType localECompress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localECompressTracker = false ;

                           public boolean isECompressSpecified(){
                               return localECompressTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.CompressType
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.CompressType getECompress(){
                               return localECompress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ECompress
                               */
                               public void setECompress(gov.nih.nlm.ncbi.pubchemAxis2.CompressType param){
                            localECompressTracker = param != null;
                                   
                                            this.localECompress=param;
                                    

                               }
                            

                        /**
                        * field for N3DConformers
                        */

                        
                                    protected int localN3DConformers ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localN3DConformersTracker = false ;

                           public boolean isN3DConformersSpecified(){
                               return localN3DConformersTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getN3DConformers(){
                               return localN3DConformers;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param N3DConformers
                               */
                               public void setN3DConformers(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localN3DConformersTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localN3DConformers=param;
                                    

                               }
                            

                        /**
                        * field for No3DParent
                        */

                        
                                    protected boolean localNo3DParent ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNo3DParentTracker = false ;

                           public boolean isNo3DParentSpecified(){
                               return localNo3DParentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getNo3DParent(){
                               return localNo3DParent;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param No3DParent
                               */
                               public void setNo3DParent(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localNo3DParentTracker =
                                       true;
                                   
                                            this.localNo3DParent=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
                           namespacePrefix+":ScoreMatrix",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ScoreMatrix",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "ListKey", xmlWriter);
                             

                                          if (localListKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ListKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localListKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localSecondaryListKeyTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "SecondaryListKey", xmlWriter);
                             

                                          if (localSecondaryListKey==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SecondaryListKey cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryListKey);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localScoreType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ScoreType cannot be null!!");
                                            }
                                           localScoreType.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","ScoreType"),
                                               xmlWriter);
                                        
                                            if (localMatrixFormat==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MatrixFormat cannot be null!!");
                                            }
                                           localMatrixFormat.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","MatrixFormat"),
                                               xmlWriter);
                                         if (localECompressTracker){
                                            if (localECompress==null){
                                                 throw new org.apache.axis2.databinding.ADBException("eCompress cannot be null!!");
                                            }
                                           localECompress.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","eCompress"),
                                               xmlWriter);
                                        } if (localN3DConformersTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "N3DConformers", xmlWriter);
                             
                                               if (localN3DConformers==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("N3DConformers cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localN3DConformers));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNo3DParentTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "No3DParent", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("No3DParent cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNo3DParent));
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "ListKey"));
                                 
                                        if (localListKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ListKey cannot be null!!");
                                        }
                                     if (localSecondaryListKeyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "SecondaryListKey"));
                                 
                                        if (localSecondaryListKey != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryListKey));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SecondaryListKey cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "ScoreType"));
                            
                            
                                    if (localScoreType==null){
                                         throw new org.apache.axis2.databinding.ADBException("ScoreType cannot be null!!");
                                    }
                                    elementList.add(localScoreType);
                                
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "MatrixFormat"));
                            
                            
                                    if (localMatrixFormat==null){
                                         throw new org.apache.axis2.databinding.ADBException("MatrixFormat cannot be null!!");
                                    }
                                    elementList.add(localMatrixFormat);
                                 if (localECompressTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "eCompress"));
                            
                            
                                    if (localECompress==null){
                                         throw new org.apache.axis2.databinding.ADBException("eCompress cannot be null!!");
                                    }
                                    elementList.add(localECompress);
                                } if (localN3DConformersTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "N3DConformers"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localN3DConformers));
                            } if (localNo3DParentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "No3DParent"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNo3DParent));
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
        public static ScoreMatrix parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ScoreMatrix object =
                new ScoreMatrix();

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
                    
                            if (!"ScoreMatrix".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ScoreMatrix)gov.nih.nlm.ncbi.pubchemAxis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","ListKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ListKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setListKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","SecondaryListKey").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"SecondaryListKey" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryListKey(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","ScoreType").equals(reader.getName())){
                                
                                                object.setScoreType(gov.nih.nlm.ncbi.pubchemAxis2.ScoreTypeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","MatrixFormat").equals(reader.getName())){
                                
                                                object.setMatrixFormat(gov.nih.nlm.ncbi.pubchemAxis2.MatrixFormatType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","eCompress").equals(reader.getName())){
                                
                                                object.setECompress(gov.nih.nlm.ncbi.pubchemAxis2.CompressType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","N3DConformers").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"N3DConformers" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setN3DConformers(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setN3DConformers(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","No3DParent").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"No3DParent" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNo3DParent(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
    