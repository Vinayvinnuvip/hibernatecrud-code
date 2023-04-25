package com.jsp.service;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {

	EmployeeDao emp = new EmployeeDao();

	public Employee getEmployeeById(int id) {
		return emp.getDetailsById(id);
	}

	public List<Employee> getAllEmployees() {
		return emp.getallDetails();
	}

	public void updateEmployee(int id) {
		emp.updateEmployee(id);
	}

	public void saveEmployee(Employee e) {

		emp.saveEmployee(e);
	}

	public void deleteEmployee(int id) {
		emp.deleteEmployee(id);

	}

}
