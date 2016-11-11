package com.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2_CompositionInjection {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		
		Employee emp1=(Employee)context.getBean("e1");
				System.out.println(emp1);
				emp1.setVehicle(null);
		Employee emp2=(Employee)context.getBean("e1");
				System.out.println(emp2);
		

	}

}
