package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Category;
import com.arindam.bean.Customer;
import com.arindam.bean.Employee;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
//Customer cst=(Customer)ac.getBean("cs");
//Employee emps=(Employee)ac.getBean("emp");
//System.out.println(emps);
Category cgs=(Category)ac.getBean("cg");
System.out.println(cgs);
	}

}
