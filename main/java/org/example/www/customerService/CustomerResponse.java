/**
 * CustomerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerResponse  implements java.io.Serializable {
    private java.math.BigInteger customerNumber;

    private org.example.www.customerService.CustomerResponseOperationResponse operationResponse;

    public CustomerResponse() {
    }

    public CustomerResponse(
           java.math.BigInteger customerNumber,
           org.example.www.customerService.CustomerResponseOperationResponse operationResponse) {
           this.customerNumber = customerNumber;
           this.operationResponse = operationResponse;
    }


    /**
     * Gets the customerNumber value for this CustomerResponse.
     * 
     * @return customerNumber
     */
    public java.math.BigInteger getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this CustomerResponse.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(java.math.BigInteger customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the operationResponse value for this CustomerResponse.
     * 
     * @return operationResponse
     */
    public org.example.www.customerService.CustomerResponseOperationResponse getOperationResponse() {
        return operationResponse;
    }


    /**
     * Sets the operationResponse value for this CustomerResponse.
     * 
     * @param operationResponse
     */
    public void setOperationResponse(org.example.www.customerService.CustomerResponseOperationResponse operationResponse) {
        this.operationResponse = operationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerResponse)) return false;
        CustomerResponse other = (CustomerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.operationResponse==null && other.getOperationResponse()==null) || 
             (this.operationResponse!=null &&
              this.operationResponse.equals(other.getOperationResponse())));
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
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getOperationResponse() != null) {
            _hashCode += getOperationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">>CustomerResponse>OperationResponse"));
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
