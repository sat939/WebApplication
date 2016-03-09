/**
 * Customer_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customer;

public interface Customer_PortType extends java.rmi.Remote {
    public java.lang.String delete(java.lang.String customer) throws java.rmi.RemoteException;
    public java.lang.String create(java.lang.String customer) throws java.rmi.RemoteException;
    public java.lang.String update(java.lang.String customer) throws java.rmi.RemoteException;
}
