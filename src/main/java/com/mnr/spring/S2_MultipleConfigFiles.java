package com.mnr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2_MultipleConfigFiles {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext(new String[]{"SpringConfig.xml","SpringConfig_1.xml"});
		
//		Bean b1 =(Bean)context.getBean("b1");
//		 System.out.println("b1="+b1);
//		 
//		 Bean b2 =(Bean)context.getBean("b2");
//		 System.out.println("b1="+b2);
		

	}

}
