/**
 * CustomerService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public interface CustomerService_PortType extends java.rmi.Remote {
    public org.example.www.customerService.CustomerResponse create(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException;
    public org.example.www.customerService.CustomerResponse update(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException;
    public org.example.www.customerService.CustomerResponse delete(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException;
}
