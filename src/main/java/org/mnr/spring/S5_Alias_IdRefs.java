package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class S5_Alias_IdRefs {

	public static void main(String[] args) {
		
		
		ApplicationContext context	=	SpringUtil.getContext();
		
		Employee	employee	=	(Employee)	context.getBean("employee");
		System.out.println(employee);
		
		Employee	aliasBean	=	(Employee)	context.getBean("employee.alias");
		System.out.println(aliasBean);
	}

}
