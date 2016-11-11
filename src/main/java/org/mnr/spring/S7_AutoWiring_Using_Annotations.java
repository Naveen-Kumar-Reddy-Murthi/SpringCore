package org.mnr.spring;

import org.mnr.util.SpringUtil;
import org.springframework.context.ApplicationContext;

public class S7_AutoWiring_Using_Annotations {

	public static void main(String[] args) {
		
		ApplicationContext context	=	SpringUtil.getContext();
		
			Developer developer		=	(Developer) context.getBean("developer");
			
			System.out.println(developer);

	}

}
