package com.jsp.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		User u=new User();
		u.setId(1);
		u.setAge(1);
		u.setName("vin");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vin");
		EntityManager em=emf.createEntityManager();
		User s=em.find(User.class,1);
//		if(s!=null) {
//			System.out.println(s.getName());
//			System.out.println(s.getId());
//			System.out.println(s.getAge());
//		}
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(u);
		
		//em.persist(u);
		et.commit();
		
		
	}
}
