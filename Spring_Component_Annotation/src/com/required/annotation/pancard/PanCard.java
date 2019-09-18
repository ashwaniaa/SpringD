package com.required.annotation.pancard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PanCard {
    @Value("12345")
	int panno;
    @Value("#{employee.empname}")
	String panname;
	public int getPanno() {
		return panno;
	}
	public void setPanno(int panno) {
		this.panno = panno;
	}
	public String getPanname() {
		return panname;
	}
	public void setPanname(String panname) {
		this.panname = panname;
	}
	
}
