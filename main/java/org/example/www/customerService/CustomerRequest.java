/**
 * CustomerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerRequest  implements java.io.Serializable {
    private java.lang.String customername;

    private org.example.www.customerService.CustomerRequestGender gender;

    private org.example.www.customerService.CustomerRequestAddress address;

    public CustomerRequest() {
    }

    public CustomerRequest(
           java.lang.String customername,
           org.example.www.customerService.CustomerRequestGender gender,
           org.example.www.customerService.CustomerRequestAddress address) {
           this.customername = customername;
           this.gender = gender;
           this.address = address;
    }


    /**
     * Gets the customername value for this CustomerRequest.
     * 
     * @return customername
     */
    public java.lang.String getCustomername() {
        return customername;
    }


    /**
     * Sets the customername value for this CustomerRequest.
     * 
     * @param customername
     */
    public void setCustomername(java.lang.String customername) {
        this.customername = customername;
    }


    /**
     * Gets the gender value for this CustomerRequest.
     * 
     * @return gender
     */
    public org.example.www.customerService.CustomerRequestGender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CustomerRequest.
     * 
     * @param gender
     */
    public void setGender(org.example.www.customerService.CustomerRequestGender gender) {
        this.gender = gender;
    }


    /**
     * Gets the address value for this CustomerRequest.
     * 
     * @return address
     */
    public org.example.www.customerService.CustomerRequestAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CustomerRequest.
     * 
     * @param address
     */
    public void setAddress(org.example.www.customerService.CustomerRequestAddress address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRequest)) return false;
        CustomerRequest other = (CustomerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customername==null && other.getCustomername()==null) || 
             (this.customername!=null &&
              this.customername.equals(other.getCustomername()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getCustomername() != null) {
            _hashCode += getCustomername().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">>CustomerRequest>gender"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">>CustomerRequest>address"));
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
