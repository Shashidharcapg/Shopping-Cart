package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entity.Student;

public class test {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student_persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student stu = new Student();
		stu.setId(102);
		stu.setName("capgemini-shashi");
		
		
		
		em.persist(stu);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}

}

