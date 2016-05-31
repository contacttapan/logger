package com.science.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.sf.aspect4log.Log;

@Service
@Log
public class CustomerService {

 private final Logger logger = LoggerFactory.getLogger(this.getClass());


public void addCustomer(String name, String address){
	logger.info("Start");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	logger.info("End");
}
}
