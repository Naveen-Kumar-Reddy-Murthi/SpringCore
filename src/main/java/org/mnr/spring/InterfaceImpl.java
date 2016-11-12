package org.mnr.spring;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class InterfaceImpl implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

	private ApplicationContext context;
	private String beanName;
	private BeanFactory factory;
	
	@Override
	public void setBeanName(String name) {
		this.beanName=name;
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory=beanFactory;
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context=applicationContext;
		
	}
	public void printAllInfo(){
		System.out.println("beanName:"+beanName);
		System.out.println("isPrototype:"+context.isPrototype("address"));
		System.out.println("isSingleton:"+context.isSingleton("employee"));
		String ids[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ids));
		
	}
}
