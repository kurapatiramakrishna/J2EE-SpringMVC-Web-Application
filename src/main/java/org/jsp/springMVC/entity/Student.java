package org.jsp.springMVC.entity;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private int rollNo;
	private String name;
	private double percentage;
	private String stream;
	public int getRollNo() 
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPercentage() 
	{
		return percentage;
	}
	public void setPercentage(double percentage) 
	{
		this.percentage = percentage;
	}
	public String getStream() 
	{
		return stream;
	}
	public void setStream(String stream) 
	{
		this.stream = stream;
	}
	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", stream=" + stream
				+ "]";
	}
}
