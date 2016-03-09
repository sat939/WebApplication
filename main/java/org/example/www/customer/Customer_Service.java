package org.example.www.customer;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

public class Customer_Service {

	public static void main(String[] args) throws IOException, AxisFault,ServiceException {

		/*Customer_BindingStub cb= new Customer_BindingStub();
		cb.create("Sathvik");
		cb.update("stat");		cb.delete("google");*/
		
		CustomerServiceLocator cs = new CustomerServiceLocator();
		cs.setServiceEndpointAddress("http://localhost:8080/WebApplication/services/Service");
		Customer_PortType cp = cs.getService();
		cp.create("sathvik");
		cp.update("abcd");
		cp.delete("qwert");
		
		
		
		
		
	}

}
