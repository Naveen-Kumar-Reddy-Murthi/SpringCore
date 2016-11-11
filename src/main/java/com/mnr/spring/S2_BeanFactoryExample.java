package com.mnr.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class S2_BeanFactoryExample {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("SpringConfig.xml"));
		
		Bean b1 =(Bean)factory.getBean("b1");
		 System.out.println("b1="+b1);
		 
		 Bean b2 =(Bean)factory.getBean("b2");
		 System.out.println("b2="+b2);

	}

}
