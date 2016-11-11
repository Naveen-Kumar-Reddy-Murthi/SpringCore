package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class S3_Collections {

	public static void main(String[] args) {

		ApplicationContext context	=	SpringUtil.getContext();
		
		Employee	emp		=(Employee) context.getBean("emp");
		System.out.println(emp);

	}

}
