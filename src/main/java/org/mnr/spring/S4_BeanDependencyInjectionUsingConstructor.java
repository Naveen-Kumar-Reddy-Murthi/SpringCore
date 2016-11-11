package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class S4_BeanDependencyInjectionUsingConstructor {

	public static void main(String[] args) {
			
			ApplicationContext context	=	SpringUtil.getContext();

			Employee emp	= (Employee)context.getBean("employee");
			System.out.println(emp);
	}

}
