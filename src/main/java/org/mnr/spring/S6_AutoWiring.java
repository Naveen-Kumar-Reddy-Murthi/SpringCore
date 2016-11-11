package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class S6_AutoWiring {

	public static void main(String[] args) {
		
		ApplicationContext context	= SpringUtil.getContext();
		
		Employee employee	= (Employee) context.getBean("employee");
		
		System.out.println(employee);

	}

}
