package com.softwarefactory.rfc.spring.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = 
		{ @ComponentScan("com.softwarefactory.rfc.service"),
	      @ComponentScan("com.softwarefactory.rfc.dao") })
public class RootConfig {
   //Service and Repository beans configuration
   //....
}