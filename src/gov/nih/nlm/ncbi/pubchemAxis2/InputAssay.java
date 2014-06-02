
/**
 * InputAssay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package gov.nih.nlm.ncbi.pubchemAxis2;
            

            /**
            *  InputAssay bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class InputAssay
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://pubchem.ncbi.nlm.nih.gov/",
                "InputAssay",
                "ns1");

            

                        /**
                        * field for AID
                        */

                        
                                    protected int localAID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAID(){
                               return localAID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AID
                               */
                               public void setAID(int param){
                            
                                            this.localAID=param;
                                    

                               }
                            

                        /**
                        * field for Columns
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.AssayColumnsType localColumns ;
                                

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.AssayColumnsType
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.AssayColumnsType getColumns(){
                               return localColumns;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Columns
                               */
                               public void setColumns(gov.nih.nlm.ncbi.pubchemAxis2.AssayColumnsType param){
                            
                                            this.localColumns=param;
                                    

                               }
                            

                        /**
                        * field for ListKeyTIDs
                        */

                        
                                    protected java.lang.String localListKeyTIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localListKeyTIDsTracker = false ;

                           public boolean isListKeyTIDsSpecified(){
                               return localListKeyTIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getListKeyTIDs(){
                               return localListKeyTIDs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ListKeyTIDs
                               */
                               public void setListKeyTIDs(java.lang.String param){
                            localListKeyTIDsTracker = param != null;
                                   
                                            this.localListKeyTIDs=param;
                                    

                               }
                            

                        /**
                        * field for ListKeySCIDs
                        */

                        
                                    protected java.lang.String localListKeySCIDs ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localListKeySCIDsTracker = false ;

                           public boolean isListKeySCIDsSpecified(){
                               return localListKeySCIDsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getListKeySCIDs(){
                               return localListKeySCIDs;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ListKeySCIDs
                               */
                               public void setListKeySCIDs(java.lang.String param){
                            localListKeySCIDsTracker = param != null;
                                   
                                            this.localListKeySCIDs=param;
                                    

                               }
                            

                        /**
                        * field for OutcomeFilter
                        */

                        
                                    protected gov.nih.nlm.ncbi.pubchemAxis2.AssayOutcomeFilterType localOutcomeFilter ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOutcomeFilterTracker = false ;

                           public boolean isOutcomeFilterSpecified(){
                               return localOutcomeFilterTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.nih.nlm.ncbi.pubchemAxis2.AssayOutcomeFilterType
                           */
                           public  gov.nih.nlm.ncbi.pubchemAxis2.AssayOutcomeFilterType getOutcomeFilter(){
                               return localOutcomeFilter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OutcomeFilter
                               */
                               public void setOutcomeFilter(gov.nih.nlm.ncbi.pubchemAxis2.AssayOutcomeFilterType param){
                            localOutcomeFilterTracker = param != null;
                                   
                                            this.localOutcomeFilter=param;
                                    

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
                           namespacePrefix+":InputAssay",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "InputAssay",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "AID", xmlWriter);
                             
                                               if (localAID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localColumns==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Columns cannot be null!!");
                                            }
                                           localColumns.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Columns"),
                                               xmlWriter);
                                         if (localListKeyTIDsTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "ListKeyTIDs", xmlWriter);
                             

                                          if (localListKeyTIDs==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ListKeyTIDs cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localListKeyTIDs);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localListKeySCIDsTracker){
                                    namespace = "http://pubchem.ncbi.nlm.nih.gov/";
                                    writeStartElement(null, namespace, "ListKeySCIDs", xmlWriter);
                             

                                          if (localListKeySCIDs==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ListKeySCIDs cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localListKeySCIDs);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOutcomeFilterTracker){
                                            if (localOutcomeFilter==null){
                                                 throw new org.apache.axis2.databinding.ADBException("OutcomeFilter cannot be null!!");
                                            }
                                           localOutcomeFilter.serialize(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","OutcomeFilter"),
                                               xmlWriter);
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
                                                                      "AID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAID));
                            
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "Columns"));
                            
                            
                                    if (localColumns==null){
                                         throw new org.apache.axis2.databinding.ADBException("Columns cannot be null!!");
                                    }
                                    elementList.add(localColumns);
                                 if (localListKeyTIDsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "ListKeyTIDs"));
                                 
                                        if (localListKeyTIDs != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListKeyTIDs));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ListKeyTIDs cannot be null!!");
                                        }
                                    } if (localListKeySCIDsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "ListKeySCIDs"));
                                 
                                        if (localListKeySCIDs != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListKeySCIDs));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ListKeySCIDs cannot be null!!");
                                        }
                                    } if (localOutcomeFilterTracker){
                            elementList.add(new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/",
                                                                      "OutcomeFilter"));
                            
                            
                                    if (localOutcomeFilter==null){
                                         throw new org.apache.axis2.databinding.ADBException("OutcomeFilter cannot be null!!");
                                    }
                                    elementList.add(localOutcomeFilter);
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
        public static InputAssay parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            InputAssay object =
                new InputAssay();

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
                    
                            if (!"InputAssay".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InputAssay)gov.nih.nlm.ncbi.pubchemAxis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","AID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"AID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","Columns").equals(reader.getName())){
                                
                                                object.setColumns(gov.nih.nlm.ncbi.pubchemAxis2.AssayColumnsType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","ListKeyTIDs").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ListKeyTIDs" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setListKeyTIDs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","ListKeySCIDs").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ListKeySCIDs" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setListKeySCIDs(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://pubchem.ncbi.nlm.nih.gov/","OutcomeFilter").equals(reader.getName())){
                                
                                                object.setOutcomeFilter(gov.nih.nlm.ncbi.pubchemAxis2.AssayOutcomeFilterType.Factory.parse(reader));
                                              
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
           
    