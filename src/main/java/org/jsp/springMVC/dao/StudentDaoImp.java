package org.jsp.springMVC.dao;


import org.jsp.springMVC.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Statement;

@Component
public class StudentDaoImp implements StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int register(Student s1) 
	{
		String insert = "insert into studentdetailes value (?, ?, ?, ?)";
		int record = jdbcTemplate.update(insert, s1.getRollNo(), s1.getName(), s1.getPercentage(), s1.getStream());
		return record;
	}

	@Override
	public Student loginOperation(int rollNo) 
	{
		String query="select * from studentdetailes where rollNo=?";
		RowMapper<Student> rm=new studentRowMapperImp1();
		try {
			Student s1=jdbcTemplate.queryForObject(query, rm,rollNo);
			return s1;
		} catch (Exception e) 
		{
			return null;
		}
		
	}

	@Override
	public int register(Statement s1) {
		// TODO Auto-generated method stub
		return 0;
	}

	}