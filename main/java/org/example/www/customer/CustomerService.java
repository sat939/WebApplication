/**
 * CustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customer;

public interface CustomerService extends javax.xml.rpc.Service {

/**
 * WSDL File for CustomerService
 */
    public java.lang.String getServiceAddress();

    public org.example.www.customer.Customer_PortType getService() throws javax.xml.rpc.ServiceException;

    public org.example.www.customer.Customer_PortType getService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
