package com.cg.employeelist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Employeedetailssort {

	public static void main(String[] args) {
ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee (22,"ishu",300.0));
		emp.add(new Employee(44,"tejaswi",460.0));
		emp.add(new Employee(55,"nellore",350.0));
		emp.add(new Employee(33,"Goa",9000.0));
		emp.add(new Employee(11,"geetha",780.0));
		emp.add(new Employee(88,"pandey",390.0));
		emp.add(new Employee(44,"Sai",359.0));
		
		
		Iterator<Employee> it = emp.iterator(); 
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
		  
		  System.out.println("------");
		  
		  it = emp.iterator();  
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emp);
	}
	

	





	}
