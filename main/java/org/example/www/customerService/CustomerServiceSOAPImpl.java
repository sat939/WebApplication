/**
 * CustomerServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.customerService;

import java.math.BigInteger;

public class CustomerServiceSOAPImpl implements org.example.www.customerService.CustomerService_PortType{
    public org.example.www.customerService.CustomerResponse create(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException {
    	CustomerResponse cr = new CustomerResponse();
    	CustomerResponseOperationResponse cros = new CustomerResponseOperationResponse();
    	cros.setSuccess("success");
    	cr.setCustomerNumber(new BigInteger("789"));
    	cr.setOperationResponse(cros);
    	return cr;
    	
    }

    public org.example.www.customerService.CustomerResponse update(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException {
    	CustomerResponse cr = new CustomerResponse();
    	cr.setCustomerNumber(new BigInteger("123456"));
    	CustomerResponseOperationResponse cros = new CustomerResponseOperationResponse();
    	cros.setSuccess("success");
    	cr.setOperationResponse(cros);
    	return cr;
    	
    	
    	
    	
    }

    public org.example.www.customerService.CustomerResponse delete(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException {
    	CustomerResponse cr = new CustomerResponse();
    	cr.setCustomerNumber(new BigInteger("64573"));
    	CustomerResponseOperationResponse cros = new CustomerResponseOperationResponse();
    	cros.setSuccess("fail");
    	cr.setOperationResponse(cros);
    	return cr;
    }

}
