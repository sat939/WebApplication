package com.sathvik.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.example.www.customerService.*;

public class SathvikWebserviceClientTest {
	
	public static void main(String args[]) throws ServiceException, RemoteException{
		
		CustomerService_ServiceLocator sl = new CustomerService_ServiceLocator();
		sl.setcustomerServiceSOAPEndpointAddress("http://localhost:8080/WebApplication/services/customerServiceSOAP");
		CustomerRequest cr = new CustomerRequest();
		cr.setCustomername("sathvik");
		CustomerRequestGender crg = new CustomerRequestGender();
		crg.setMale("male");
		CustomerRequestAddress cra = new CustomerRequestAddress();
		cra.setState("missouri");
		cra.setCity("st.louis");
		cra.setStreet("abcd");
		cra.setCountry("USA");
		cr.setAddress(cra);
		cr.setGender(crg);
		
		
		CustomerService_PortType cp = sl.getcustomerServiceSOAP();
		CustomerResponse cres= cp.create(cr);
		CustomerResponseOperationResponse cror = cres.getOperationResponse();
		System.out.println(cres.getCustomerNumber());
		System.out.println(cror.getSuccess());
		
		

}
}
