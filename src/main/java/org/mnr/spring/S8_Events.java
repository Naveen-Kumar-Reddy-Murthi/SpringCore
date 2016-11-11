package org.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S8_Events {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig_2.xml");
//		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("SpringConfig_2.xml");
		((Lifecycle) context).start();
//		ConfigurableApplicationContext //for applicaiton events
		Employee emp	=	(Employee) context.getBean("employee");
		System.out.println(emp);
		Employee emp1	=	(Employee) context.getBean("employee");
		System.out.println(emp1);
		System.out.println(emp==emp1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Lifecycle) context).stop(); 
		System.out.println("stopped");

	}

}
