package org.jsp.springMVC.dao;

import org.jsp.springMVC.entity.Student;

import com.mysql.cj.xdevapi.Statement;

public interface StudentDao 
{
    public int register(Statement s1);
   Student loginOperation(int rollNo);
int register(Student s1);
}
 
