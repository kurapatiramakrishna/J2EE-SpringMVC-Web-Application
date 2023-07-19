package org.jsp.springMVC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jsp.springMVC.entity.Student;
import org.springframework.jdbc.core.RowMapper;

public class studentRowMapperImp1 implements RowMapper<Student>
{
@Override
public Student mapRow(ResultSet rs,int rowNum) throws SQLException
{
	Student s1=new Student();
	s1.setRollNo(rs.getInt("rollno"));
	s1.setName(rs.getString("stdname"));
	s1.setPercentage(rs.getDouble("percentage"));
	s1.setStream(rs.getString("stream"));	
	return s1;
	}
}
