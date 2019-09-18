package com.client;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.required.annotation.Employee;


public class Test {
public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("Bean.xml");
	                 Employee emp=ctx.getBean("employee",Employee.class);
	                 System.out.println(emp.getEmpid()+"\n"+emp.getEmpname()+"\n"+emp.getPancard().getPanno()+"\n"+emp.getPancard().getPanname());
	                 System.out.println("Pancard hashcode: "+emp.getPancard().hashCode());
	                 System.out.println("Employee hashcode: "+emp.hashCode());
	                 
	                 System.out.println(emp.getEmpid()+"\n"+emp.getEmpname()+"\n"+emp.getPancard().getPanno()+"\n"+emp.getPancard().getPanname());
	                 System.out.println("Pancard hashcode2: "+emp.getPancard().hashCode());
	                 System.out.println("Employee hashcode2: "+emp.hashCode());
	                 
	                 System.out.println(emp.getEmpid()+"\n"+emp.getEmpname()+"\n"+emp.getPancard().getPanno()+"\n"+emp.getPancard().getPanname());
	                 System.out.println("Pancard hashcode2: "+emp.getPancard().hashCode());
	                 System.out.println("Employee hashcode2: "+emp.hashCode());
	                
	                 ((AbstractApplicationContext)ctx).close();
	                 
}
}
