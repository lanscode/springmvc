package com.spmvc.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spmvc.models.Employee;
import com.spmvc.services.EmployeeService;
import com.spmvc.services.EmployeeServiceImpl;

public class Test {
 public static void main(String[]args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("../../../daoConfig.xml",HomeController.class);
	 System.out.print("the context of this app is "+context);
	 EmployeeService s=context.getBean("service",EmployeeServiceImpl.class);
     Employee e=new Employee();
     System.out.println("***hello here service is"+s+" and the factory is  "+context.getBean("factory"));
     e.setName("Test");
     s.save(e);
 }
}
