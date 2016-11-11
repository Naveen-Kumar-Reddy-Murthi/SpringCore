package org.mnr.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S9_BeanLifeCycleMethods {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig_2.xml");
		context.registerShutdownHook();//necessary for bean life cyle methods to execute
		LifeCycleBean bean = (LifeCycleBean) context.getBean("lifeCycleBean");
		System.out.println(bean);
		context.stop();

	}

}
