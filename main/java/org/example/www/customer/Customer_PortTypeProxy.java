package org.example.www.customer;

public class Customer_PortTypeProxy implements org.example.www.customer.Customer_PortType {
  private String _endpoint = null;
  private org.example.www.customer.Customer_PortType customer_PortType = null;
  
  public Customer_PortTypeProxy() {
    _initCustomer_PortTypeProxy();
  }
  
  public Customer_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomer_PortTypeProxy();
  }
  
  private void _initCustomer_PortTypeProxy() {
    try {
      customer_PortType = (new org.example.www.customer.CustomerServiceLocator()).getService();
      if (customer_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customer_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customer_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customer_PortType != null)
      ((javax.xml.rpc.Stub)customer_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.customer.Customer_PortType getCustomer_PortType() {
    if (customer_PortType == null)
      _initCustomer_PortTypeProxy();
    return customer_PortType;
  }
  
  public java.lang.String delete(java.lang.String customer) throws java.rmi.RemoteException{
    if (customer_PortType == null)
      _initCustomer_PortTypeProxy();
    return customer_PortType.delete(customer);
  }
  
  public java.lang.String create(java.lang.String customer) throws java.rmi.RemoteException{
    if (customer_PortType == null)
      _initCustomer_PortTypeProxy();
    return customer_PortType.create(customer);
  }
  
  public java.lang.String update(java.lang.String customer) throws java.rmi.RemoteException{
    if (customer_PortType == null)
      _initCustomer_PortTypeProxy();
    return customer_PortType.update(customer);
  }
  
  
}