package com.arindam.client;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.arindam.entity.Adhar;
import com.arindam.entity.Candidate;
import com.arindam.entity.College;
import com.arindam.entity.Company;
import com.arindam.entity.Customer;
import com.arindam.entity.Delegate;
import com.arindam.entity.Employee;
import com.arindam.entity.Event;
import com.arindam.entity.Job;
import com.arindam.entity.Student;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityTransaction tx=null;
EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
EntityManager em=emf.createEntityManager();
tx=em.getTransaction();
tx.begin();
//Customer cs1=new Customer("C1","ALOKE","535353");
//em.persist(cs1);
/*Employee emp1=new Employee();
Employee emp2=new Employee();
emp1.setEdesig("MANAGER");
emp1.setEname("ARUP");
emp1.setJoindt(new Date());
emp1.setWorkhr(new Date());
emp1.setEmail("a@gmail.com");
emp2.setEdesig("ANALYST");
emp2.setEname("ANNANYA");
emp2.setEdesig("MANAGER");
emp2.setJoindt(new Date());
emp2.setWorkhr(new Date());
emp2.setEmail("an@gmail.com");
em.persist(emp1);
em.persist(emp2);*/
/*Adhar adh1=new Adhar("ASFS123","KOLKATA");
Adhar adh2=new Adhar("ADG568","CHENNAI");
Candidate cn1=new Candidate("C1","AYAN", adh1);
Candidate cn2=new Candidate("C2","RAMAN", adh2);
em.persist(adh1);
em.persist(adh2);
em.persist(cn1);
em.persist(cn2);*/
/*Student sd1=new Student(1,"ROBIN");
Student sd2=new Student(2,"ALOKE");
Student sd3=new Student(3,"NAYAN");
Student sd4=new Student(4,"JAYANTA");
College clg1=new College("CG1","AEC",Arrays.asList(sd1,sd3));
College clg2=new College("CG2","ABACUS",Arrays.asList(sd2,sd4));
em.persist(sd1);
em.persist(sd2);
em.persist(sd3);
em.persist(sd4);
em.persist(clg1);
em.persist(clg2);*/
/*Company cp1=new Company("C1","XYZLTD","KOLKATA");
Company cp2=new Company("C2","ABCLTD","MUMBAI");
Job jb1=new Job("JV","JAVA",cp1);
Job jb2=new Job("NT","DOTNET", cp1);
Job jb3=new Job("NJ","NODEJS", cp2);
Job jb4=new Job("RS","REACTJS", cp2);
em.persist(cp1);
em.persist(cp2);
em.persist(jb1);
em.persist(jb2);
em.persist(jb3);
em.persist(jb4);*/
Delegate d1=new Delegate("D1","SUMAN");
Delegate d2=new Delegate("D2","ALOKE");
Delegate d3=new Delegate("D3","AJOY");
Event ev1=new Event("E1","JAVA",Arrays.asList(d1,d2));
Event ev2=new Event("E2","REACTJS",Arrays.asList(d1,d3));
/*em.persist(d1);
em.persist(d2);
em.persist(d3);
em.persist(ev1);
em.persist(ev2);*/
String jpql="select e from Event e";
Query query=em.createQuery(jpql);
List<Event> elist=query.getResultList();
elist.stream().forEach(System.out::println);
String sql="SELECT D.DELGNM,E.EVNM FROM EVENT E,DELEGATE D,EVENT_DELEGATE ED WHERE E.EVID=ED.EVID AND ED.DELGID=D.DELGID";
Query query1=em.createNativeQuery(sql);
List<Object[]> delist=query1.getResultList();
//delist.stream().forEach(System.out::println);
delist.stream().map(l->l[0]+"===>"+l[1]).forEach(System.out::println);
/*for(Object[] o:delist)
{
	System.out.println(o[0]+"===>"+o[1]);
}*/
tx.commit();
emf.close();

	}

}
