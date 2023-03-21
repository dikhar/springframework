package com.springframework.AOP.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.AOP.springaop.dao.dao1;

@Service
public class business1 {
	@Autowired
	private dao1 Dao1;
	
	public 	String calculate()
	{
		return Dao1.retriveData();
	}
}
