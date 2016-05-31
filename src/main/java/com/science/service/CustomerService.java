package com.science.service;

import net.sf.aspect4log.Log;
@Log
public class CustomerService {

public void addCustomer(String name, String address){
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
