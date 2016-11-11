package org.mnr.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {
	
	private SpringUtil(){
		//restricts initialization
	}
	
	public static ApplicationContext context=null;
	
	public static ApplicationContext getContext(){
		
		if(context	!=	null)
			return context;
		else{
//			context= new ClassPathXmlApplicationContext("SpringConfig_1.xml","SpringConfig_2.xml");
			context= new ClassPathXmlApplicationContext("SpringConfig_1.xml");
			return context;
		}
			
		}
		
		
	}

