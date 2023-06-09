//package com.springframework.AOP.springaop.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//
//@Aspect
//@Configuration
//public class BeforeAspect {
//	
//	private Logger logger=LoggerFactory.getLogger(this.getClass());
//	
//	@Before("exec")
//	public void before(JoinPoint joinpoint)
//	{
//		logger.info("Intercept");
//		logger.info("Allowed execution",joinpoint);
//	}
//}
