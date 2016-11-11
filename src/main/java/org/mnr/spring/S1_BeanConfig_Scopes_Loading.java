package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S1_BeanConfig_Scopes_Loading {

	public static void main(String[] args) {
		  
		/*
		 * ApplicationContext does eagar loading with Singleton Scope by default
		 */
		
		ApplicationContext context	=	SpringUtil.getContext();
			
		/*
		 * Singleton bean is created only once during container initialisation.
		 * Singleton bean is eagarly loaded during container creation
		 * Same bean is returned to each getBean call
		 * Any changes to that bean will reflect in all other calls
		 */
		Employee emp	= (Employee)context.getBean("emp1");
//		System.out.println("emp:"+emp.toString());
//		emp.setId(123456);
//		System.out.println("emp after changing:"+emp.toString());
		Employee emp1	= (Employee)context.getBean("emp1");
//		System.out.println("emp1:"+emp.toString());
		
		System.out.println(emp==emp1);
		
		/*
		 * Prototype bean will be created freshly for every getBean call
		 * Each call will get a new object
		 */
		
		Employee prototype	= (Employee) context.getBean("emp2");
		Employee prototype1	= (Employee) context.getBean("emp2");
		System.out.println(prototype==prototype1);
		
		
	}

}
