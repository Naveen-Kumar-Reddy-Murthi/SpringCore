package org.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S1_ApplicationContext {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig_2.xml");
		Employee emp	=	(Employee) context.getBean("employee");
		System.out.println(emp);
		Employee emp1	=	(Employee) context.getBean("employee");
		System.out.println(emp1);
		System.out.println(emp==emp1);
		
	}

}
