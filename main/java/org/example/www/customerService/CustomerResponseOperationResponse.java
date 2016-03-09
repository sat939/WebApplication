/**
 * CustomerResponseOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerResponseOperationResponse  implements java.io.Serializable {
    private java.lang.String success;

    private java.lang.String fail;

    public CustomerResponseOperationResponse() {
    }

    public CustomerResponseOperationResponse(
           java.lang.String success,
           java.lang.String fail) {
           this.success = success;
           this.fail = fail;
    }


    /**
     * Gets the success value for this CustomerResponseOperationResponse.
     * 
     * @return success
     */
    public java.lang.String getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CustomerResponseOperationResponse.
     * 
     * @param success
     */
    public void setSuccess(java.lang.String success) {
        this.success = success;
    }


    /**
     * Gets the fail value for this CustomerResponseOperationResponse.
     * 
     * @return fail
     */
    public java.lang.String getFail() {
        return fail;
    }


    /**
     * Sets the fail value for this CustomerResponseOperationResponse.
     * 
     * @param fail
     */
    public void setFail(java.lang.String fail) {
        this.fail = fail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerResponseOperationResponse)) return false;
        CustomerResponseOperationResponse other = (CustomerResponseOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.fail==null && other.getFail()==null) || 
             (this.fail!=null &&
              this.fail.equals(other.getFail())));
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
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getFail() != null) {
            _hashCode += getFail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerResponseOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">>CustomerResponse>OperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fail"));
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
