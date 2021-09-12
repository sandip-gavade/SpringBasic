package com.srg.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	ConfigurationDemoBean getConfigurationBean() {
	 return new ConfigurationDemoBean();	
	}
}
