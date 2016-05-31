package com.test.logger;

import org.junit.Test;

import com.science.service.CustomerService;

public class TestCustomer {
@Test
public void testCustomer(){
	CustomerService service=new CustomerService();
	service.addCustomer("Tapan", "Bangalore");
	
}
}
