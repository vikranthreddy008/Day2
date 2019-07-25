package com.lti.bean;

public class Manager extends Employee {
private String department;
public Manager() {
	// TODO Auto-generated constructor stub
}
public String getDepartment() {
	return department;
}
public Manager(int eid,String ename,double salary,String department) {
	super.setEid(eid);
	setEname(ename);
	super.salary=salary;
	this.department=department;
}


public Manager(int i, String string, double d) {
	// TODO Auto-generated constructor stub
}
public void setDepartment(String department) {
	this.department = department;
}






	

}
