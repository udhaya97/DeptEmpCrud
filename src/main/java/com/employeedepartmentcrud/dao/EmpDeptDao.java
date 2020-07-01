package com.employeedepartmentcrud.dao;

import com.employeedepartmentcrud.model.Department;
import com.employeedepartmentcrud.model.Employee;

public interface EmpDeptDao {
	
	//create a department
	void createDept(Department dept);
	//update a department
	void updateDept(int deptId,Department dept);
	//Get All Department
    void readAllDept();
    //delete department with all associated employees
    void delteDept(int deptId);
    //Create Employee With Associate Department id
    void createEmp(Employee employee,int deptId);
    //Update employee details with in department
    void updateEmp(Employee employee,int empId,int deptId);
    // Get all employees based on department id
    void readEmpFromDept(int empId);
    //delete employee in department
    void deleteEmpFromDept(int deptId,int empId);

  
    
    

}
