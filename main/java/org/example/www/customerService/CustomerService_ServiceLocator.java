/**
 * CustomerService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerService_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.customerService.CustomerService_Service {

    public CustomerService_ServiceLocator() {
    }


    public CustomerService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for customerServiceSOAP
    private java.lang.String customerServiceSOAP_address = "http://localhost:8080/WebApplication/services/customerServiceSOAP";

    public java.lang.String getcustomerServiceSOAPAddress() {
        return customerServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String customerServiceSOAPWSDDServiceName = "customerServiceSOAP";

    public java.lang.String getcustomerServiceSOAPWSDDServiceName() {
        return customerServiceSOAPWSDDServiceName;
    }

    public void setcustomerServiceSOAPWSDDServiceName(java.lang.String name) {
        customerServiceSOAPWSDDServiceName = name;
    }

    public org.example.www.customerService.CustomerService_PortType getcustomerServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(customerServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcustomerServiceSOAP(endpoint);
    }

    public org.example.www.customerService.CustomerService_PortType getcustomerServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.customerService.CustomerServiceSOAPStub _stub = new org.example.www.customerService.CustomerServiceSOAPStub(portAddress, this);
            _stub.setPortName(getcustomerServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcustomerServiceSOAPEndpointAddress(java.lang.String address) {
        customerServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.customerService.CustomerService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.customerService.CustomerServiceSOAPStub _stub = new org.example.www.customerService.CustomerServiceSOAPStub(new java.net.URL(customerServiceSOAP_address), this);
                _stub.setPortName(getcustomerServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("customerServiceSOAP".equals(inputPortName)) {
            return getcustomerServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/customerService/", "customerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/customerService/", "customerServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("customerServiceSOAP".equals(portName)) {
            setcustomerServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
