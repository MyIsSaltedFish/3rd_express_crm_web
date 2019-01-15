package com.qf.express.crm.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qf.express.crm.client.CustomerService;
import com.qf.express.crm.client.TCustomer;

@Controller
public class TestAcrion {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="test",method=RequestMethod.POST)
	@ResponseBody
	public String test01() {
		return "hello world";
	}
	@RequestMapping(value="test1",method=RequestMethod.POST)
	@ResponseBody
	public List<TCustomer> test02() {
		return customerService.findCustomerNoAss();
	}
	@RequestMapping(value="test2",method=RequestMethod.POST)
	@ResponseBody
	public List<TCustomer> test03(String id) {
		return customerService.findCustomerAss(id);
	}
}
