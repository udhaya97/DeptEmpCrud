package com.employeedepartmentcrud;

import com.employeedepartmentcrud.dao.EmpDeptDao;
import com.employeedepartmentcrud.dao.EmpDeptDaoImpl;
import com.employeedepartmentcrud.model.Department;
import com.employeedepartmentcrud.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Department dep = new Department(1,"training");
    	Department dep1 = new Department(2,"development");
    	Department dep2 = new Department(3,"support");
    	Employee emp = new Employee(1,"Udhay","udhay@gmail.com",23);
    	Employee emp1 = new Employee(10,"rakesh","rake@gmail.com",26);
    	Employee emp2 = new Employee(12,"kishore","ksh@gmail.com",27);
        Employee emp4 = new Employee (15,"Kumar","kum@gmail.com",16);
    	EmpDeptDao edo = new EmpDeptDaoImpl();
        
     
        System.out.println("Create Department");
        edo.createDept(dep);
        edo.createDept(dep2);
        edo.createDept(dep1);
        
        System.out.println("Update Department");
        edo.updateDept(dep.getDept_id(), dep1);
        System.out.println("Read All Department values");
        edo.readAllDept();
        
        System.out.println("Delete Department");
        edo.delteDept(dep2.getDept_id());
        
        System.out.println("Create Employee With Depatment id");
        
        edo.createEmp(emp, dep2.getDept_id());
        edo.createEmp(emp1, dep1.getDept_id());
        edo.createEmp(emp2, dep.getDept_id());
        edo.createEmp(emp, dep.getDept_id());
        edo.createEmp(emp1, dep2.getDept_id());
        edo.createEmp(emp2, dep1.getDept_id());
        
        System.out.println("Update Employee from Department");
        edo.updateEmp(emp4, emp2.getEmp_id(), dep.getDept_id());
        
        System.out.println("Employees from same department");
        edo.readEmpFromDept(dep2.getDept_id());
        
        System.out.println("Delete Employee From Department");
        edo.deleteEmpFromDept(dep.getDept_id(), emp.getEmp_id());
        
    }
    
}
