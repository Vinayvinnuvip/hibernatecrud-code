package com.jsp.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int i;
		EmployeeService emp = new EmployeeService();

		// TODO Auto-generated method stub
		do {
			System.out.println("1.for save data");
			System.out.println("2.get emp by id");
			System.out.println("3.get all emps");
			System.out.println("4.update emp");
			System.out.println("5.delete emp");
			System.out.println("6.for exit");
			System.out.println("enter ur option");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("enter name:");
				String name = sc.next();
				System.out.println("enter id:");
				int id = sc.nextInt();
				System.out.println("enter salary:");
				double salary = sc.nextDouble();
				
				Employee e = new Employee();
				e.setName(name);
				e.setId(id);
				e.setEmp_salary(salary);
				
				emp.saveEmployee(e);
				break;
			case 2:
				System.out.println("enter id:");
				int id1 = sc.nextInt();
				Employee e1 = emp.getEmployeeById(id1);
				System.out.println(e1.getName() + " " + e1.getId() + " " + e1.getEmp_salary());
				break;
			case 3:
				List<Employee> list = emp.getAllEmployees();
				for (Employee u : list) {
					System.out.println(u.getName() + " " + u.getId() + " " + u.getEmp_salary());
				}
				break;
			case 4:
				System.out.println("enter id:");
				int id2 = sc.nextInt();
				emp.updateEmployee(id2);
				break;
			case 5:
				System.out.println("enter id:");
				int id3 = sc.nextInt();
				emp.deleteEmployee(id3);
				break;
			case 6:
				sc.close();
			}
		} while (i < 6);

	}

}
