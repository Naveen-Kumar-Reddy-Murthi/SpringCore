package com.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S1_BeanConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		/*Customer c1 = (Customer)context.getBean("c1");
			System.out.println(c1.getId()+"\t"+c1.getName());
			
		Customer c2 = (Customer)context.getBean("c2");
			System.out.println(c2.getId()+"\t"+c2.getName());*/

		Customer c3 = (Customer)context.getBean("c3");
			System.out.println(c3.getName()+"\t"+c3.getId());
	}

}
