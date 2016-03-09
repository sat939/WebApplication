/**
 * Customer_BindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customer;

public class Customer_BindingSkeleton implements org.example.www.customer.Customer_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.customer.Customer_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("create", _params, new javax.xml.namespace.QName("", "Response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "create"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("create") == null) {
            _myOperations.put("create", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("create")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("delete", _params, new javax.xml.namespace.QName("", "Response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "delete"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("delete") == null) {
            _myOperations.put("delete", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("delete")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "customer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("update", _params, new javax.xml.namespace.QName("", "Response"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "update"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("update") == null) {
            _myOperations.put("update", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("update")).add(_oper);
    }

    public Customer_BindingSkeleton() {
        this.impl = new org.example.www.customer.Customer_BindingImpl();
    }

    public Customer_BindingSkeleton(org.example.www.customer.Customer_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String create(java.lang.String customer) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.create(customer);
        return ret;
    }

    public java.lang.String delete(java.lang.String customer) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.delete(customer);
        return ret;
    }

    public java.lang.String update(java.lang.String customer) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.update(customer);
        return ret;
    }

}
