/**
 * CustomerService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public interface CustomerService_Service extends javax.xml.rpc.Service {
    public java.lang.String getcustomerServiceSOAPAddress();

    public org.example.www.customerService.CustomerService_PortType getcustomerServiceSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.customerService.CustomerService_PortType getcustomerServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
