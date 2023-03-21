package com.springframework.AOP.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.AOP.springaop.dao.dao2;

@Service
public class business2{
	@Autowired
	private dao2 Dao2;
	
	public 	String calculate()
	{
		return Dao2.retriveData();
	}
}