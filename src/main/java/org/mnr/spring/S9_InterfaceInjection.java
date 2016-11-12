package org.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S9_InterfaceInjection {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig_2.xml");
		InterfaceImpl impl		= (InterfaceImpl) context.getBean("aware");
		impl.printAllInfo();
		

	}

}
