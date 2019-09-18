package com.required.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.required.annotation.pancard.PanCard;
@Component
@Scope("singleton")
public class Employee {
	@Value("63330")
	int empid;
	@Value("Monto Saini")
	String empname;
	@Autowired
	PanCard pancard;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public PanCard getPancard() {
		return pancard;
	}
	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}
	
}
