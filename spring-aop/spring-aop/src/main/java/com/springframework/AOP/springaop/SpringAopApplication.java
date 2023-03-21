package com.springframework.AOP.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springframework.AOP.springaop.business.business1;
import com.springframework.AOP.springaop.business.business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private business1 Business1;
	
	@Autowired
	private business2 Business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(Business1.calculate());
		logger.info(Business2.calculate());
	}
}
