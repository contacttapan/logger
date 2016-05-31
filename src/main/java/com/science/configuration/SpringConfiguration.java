package com.science.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.science.logger.LoggingAspect;

@Configuration
@ComponentScan("com.science")
@EnableAspectJAutoProxy
public class SpringConfiguration {

        
        
}