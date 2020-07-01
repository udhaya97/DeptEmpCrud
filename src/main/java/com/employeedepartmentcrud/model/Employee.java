package com.employeedepartmentcrud.model;

public class Employee {

	private int emp_id;
	private String emp_name;
	private String mailId;
	private int age;
	private Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int emp_id, String emp_name, String mailId, int age) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.mailId = mailId;
		this.age = age;
		
	}
	public Employee() {
		super();
	}
	
	
}
