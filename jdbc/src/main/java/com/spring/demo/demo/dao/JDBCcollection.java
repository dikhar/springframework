package com.spring.demo.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.demo.demo.dao.entity.person;

@Repository
public class JDBCcollection {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<person> findall()//find all id in table
	{
		return jdbcTemplate.query("select * from person", 
				new BeanPropertyRowMapper<person>(person.class));
	}
	public person findId(int id)
	{
		return jdbcTemplate.queryForObject("select * from person where id=",new Object[]{id},
				new BeanPropertyRowMapper<person>(person.class));
	}
}
	