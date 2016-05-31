package com.test.logger;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.science.configuration.SpringConfiguration;
import com.science.logger.LoggingAspect;
import com.science.service.CustomerService;

public class TestCustomer {
private AnnotationConfigApplicationContext applicationContext;

@Test
public void testCustomer(){
	try{
	applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);	
	CustomerService service=applicationContext.getBean(CustomerService.class);
	LoggingAspect log=applicationContext.getBean(LoggingAspect.class);
	service.addCustomer("Tapan", "Bangalore");
	}catch(Exception exe){
		exe.printStackTrace();
	}
	
}
}
