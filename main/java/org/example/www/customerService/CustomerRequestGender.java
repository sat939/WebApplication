/**
 * CustomerRequestGender.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerRequestGender  implements java.io.Serializable {
    private java.lang.String male;

    private java.lang.String female;

    public CustomerRequestGender() {
    }

    public CustomerRequestGender(
           java.lang.String male,
           java.lang.String female) {
           this.male = male;
           this.female = female;
    }


    /**
     * Gets the male value for this CustomerRequestGender.
     * 
     * @return male
     */
    public java.lang.String getMale() {
        return male;
    }


    /**
     * Sets the male value for this CustomerRequestGender.
     * 
     * @param male
     */
    public void setMale(java.lang.String male) {
        this.male = male;
    }


    /**
     * Gets the female value for this CustomerRequestGender.
     * 
     * @return female
     */
    public java.lang.String getFemale() {
        return female;
    }


    /**
     * Sets the female value for this CustomerRequestGender.
     * 
     * @param female
     */
    public void setFemale(java.lang.String female) {
        this.female = female;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRequestGender)) return false;
        CustomerRequestGender other = (CustomerRequestGender) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.male==null && other.getMale()==null) || 
             (this.male!=null &&
              this.male.equals(other.getMale()))) &&
            ((this.female==null && other.getFemale()==null) || 
             (this.female!=null &&
              this.female.equals(other.getFemale())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMale() != null) {
            _hashCode += getMale().hashCode();
        }
        if (getFemale() != null) {
            _hashCode += getFemale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerRequestGender.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">>CustomerRequest>gender"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("male");
        elemField.setXmlName(new javax.xml.namespace.QName("", "male"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("female");
        elemField.setXmlName(new javax.xml.namespace.QName("", "female"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
