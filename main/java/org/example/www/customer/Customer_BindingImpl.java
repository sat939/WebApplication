/**
 * Customer_BindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customer;

public class Customer_BindingImpl implements org.example.www.customer.Customer_PortType{
    public java.lang.String create(java.lang.String customer) throws java.rmi.RemoteException {
        return "succcess" +customer;
    }

    public java.lang.String delete(java.lang.String customer) throws java.rmi.RemoteException {
        return "succcess"+customer;
    }

    public java.lang.String update(java.lang.String customer) throws java.rmi.RemoteException {
        return "fail"+customer;
    }

}
