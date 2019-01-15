package com.qf.express.crm.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by Apache CXF 3.1.17
 * 2018-11-02T15:05:43.848+08:00
 * Generated source version: 3.1.17
 * 
 */
@WebService(targetNamespace = "http://api.crm.express.qf.com/", name = "CustomerService")
//@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {
	@WebMethod
	TCustomer findCusByPhone(String phone);
    @WebMethod
    @RequestWrapper(localName = "findCustomerAss", targetNamespace = "http://api.crm.express.qf.com/", className = "com.qf.express.crm.client.FindCustomerAss")
    @ResponseWrapper(localName = "findCustomerAssResponse", targetNamespace = "http://api.crm.express.qf.com/", className = "com.qf.express.crm.client.FindCustomerAssResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.qf.express.crm.client.TCustomer> findCustomerAss(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "findCustomerNoAss", targetNamespace = "http://api.crm.express.qf.com/", className = "com.qf.express.crm.client.FindCustomerNoAss")
    @ResponseWrapper(localName = "findCustomerNoAssResponse", targetNamespace = "http://api.crm.express.qf.com/", className = "com.qf.express.crm.client.FindCustomerNoAssResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.qf.express.crm.client.TCustomer> findCustomerNoAss();
}