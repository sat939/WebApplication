package org.example.www.customerService;

public class CustomerServiceProxy implements org.example.www.customerService.CustomerService_PortType {
  private String _endpoint = null;
  private org.example.www.customerService.CustomerService_PortType customerService_PortType = null;
  
  public CustomerServiceProxy() {
    _initCustomerServiceProxy();
  }
  
  public CustomerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerServiceProxy();
  }
  
  private void _initCustomerServiceProxy() {
    try {
      customerService_PortType = (new org.example.www.customerService.CustomerService_ServiceLocator()).getcustomerServiceSOAP();
      if (customerService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerService_PortType != null)
      ((javax.xml.rpc.Stub)customerService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.customerService.CustomerService_PortType getCustomerService_PortType() {
    if (customerService_PortType == null)
      _initCustomerServiceProxy();
    return customerService_PortType;
  }
  
  public org.example.www.customerService.CustomerResponse create(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException{
    if (customerService_PortType == null)
      _initCustomerServiceProxy();
    return customerService_PortType.create(parameters);
  }
  
  public org.example.www.customerService.CustomerResponse update(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException{
    if (customerService_PortType == null)
      _initCustomerServiceProxy();
    return customerService_PortType.update(parameters);
  }
  
  public org.example.www.customerService.CustomerResponse delete(org.example.www.customerService.CustomerRequest parameters) throws java.rmi.RemoteException{
    if (customerService_PortType == null)
      _initCustomerServiceProxy();
    return customerService_PortType.delete(parameters);
  }
  
  
}