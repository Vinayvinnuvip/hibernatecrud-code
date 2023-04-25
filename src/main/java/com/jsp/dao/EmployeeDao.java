package com.jsp.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

public class EmployeeDao {
	public EntityManager getem() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vin");
		EntityManager em = emf.createEntityManager();
		return em;
	}

	public void saveEmployee(Employee e) {
		EntityManager em = getem();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
	}

	public Employee getDetailsById(int id) {
		EntityManager em = getem();
		Employee e = em.find(Employee.class, id);
		return e;
	}

	public List<Employee> getallDetails() {
		EntityManager em = getem();
		Query q = em.createQuery("select u from Employee u");
		List<Employee> list = q.getResultList();

		return list;
	}

	public void updateEmployee(int id) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enetr name");
		String name = sc1.next();
		System.out.println("enter salary:");
		double salary = sc1.nextDouble();
		EntityManager em = getem();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e = em.find(Employee.class, id);

		if (e != null) {
			e.setName(name);
			e.setEmp_salary(salary);
		}

		et.commit();
	}

	public void deleteEmployee(int id) {
		EntityManager em = getem();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e = em.find(Employee.class, id);
		em.remove(e);
		et.commit();
	}
	/*
	 * public static void main(String[] args) { /*e.setEmp_salary(100); e.setId(1);
	 * e.setName("vin");
	 * 
	 * 
	 * List<Employee> e=p.getallDetails();
	 * 
	 * 
	 * //p.updateEmployee(1); //p.saveEmployee(e);
	 * 
	 * // System.out.println(e.getName()); EmployeeDao p=new EmployeeDao();
	 * EntityManager em=p.getem(); Query
	 * q=em.createQuery("select u from Employee u where emp_name=?1");
	 * q.setParameter(1, "viny"); List<Employee> e=q.getResultList(); for(Employee
	 * u: e) { System.out.println(u.getId()+" "+u.getName()+" "+u.getEmp_salary());
	 * }
	 */

	// }*/

}
