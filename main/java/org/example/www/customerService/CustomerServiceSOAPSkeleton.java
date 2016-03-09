/**
 * CustomerServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

public class CustomerServiceSOAPSkeleton implements org.example.www.customerService.CustomerService_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.customerService.CustomerService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerRequest"), org.example.www.customerService.CustomerRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("create", _params, new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "create"));
        _oper.setSoapAction("http://www.example.org/customerService/create");
        _myOperationsList.add(_oper);
        if (_myOperations.get("create") == null) {
            _myOperations.put("create", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("create")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerRequest"), org.example.www.customerService.CustomerRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("update", _params, new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "update"));
        _oper.setSoapAction("http://www.example.org/customerService/update");
        _myOperationsList.add(_oper);
        if (_myOperations.get("update") == null) {
            _myOperations.put("update", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("update")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerRequest"), org.example.www.customerService.CustomerRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("delete", _params, new javax.xml.namespace.QName("http://www.example.org/customerService/", "CustomerResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/customerService/", ">CustomerResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "delete"));
        _oper.setSoapAction("http://www.example.org/customerService/delete");
        _myOperationsList.add(_oper);
        if (_myOperations.get("delete") == null) {
            _myOperations.put("delete", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("delete")).add(_oper);
    }

    public CustomerServiceSOAPSkeleton() {
        this.impl = new org.example.www.customerService.CustomerServiceSOAPImpl();
    }

    public CustomerServiceSOAPSkeleton(org.example.www.customerService.CustomerService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.customerService.CustomerResponse create(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException
    {
        org.example.www.customerService.CustomerResponse ret = impl.create(parameters);
        return ret;
    }

    public org.example.www.customerService.CustomerResponse update(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException
    {
        org.example.www.customerService.CustomerResponse ret = impl.update(parameters);
        return ret;
    }

    public org.example.www.customerService.CustomerResponse delete(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException
    {
        org.example.www.customerService.CustomerResponse ret = impl.delete(parameters);
        return ret;
    }

}
