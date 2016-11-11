package org.mnr.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class S1_XMLBeanFactoryImpl {

	public static void main(String[] args) {
		
		
		
		FileSystemResource resource = new FileSystemResource("F:\\Git\\Git-LunaWorkSpace\\SpringCore\\src\\main\\resources\\XmlBeanFactoryConfig.xml");
		
//		ClassPathResource // this also can be passed but it will search the xml file in classpath env variable
		XmlBeanFactory factory =	 new XmlBeanFactory(resource);
		
		Address address = (Address) factory.getBean("address");
		System.out.println(address);
		System.out.println(address.hashCode());
		
		Address address1 = (Address) factory.getBean("address");
		System.out.println(address1);
		System.out.println(address1.hashCode());
		
		System.out.println(address==address1);
		
		/**
		 * Disadvantages:
		 * 1. Doesn't support multiple config files
		 * 2. does lazy loading of beans
		 * 3. Additional object need to be passed for the creation of container.
		 * 4. doesn't support event handling, property loading, internationalization etc 
		 */

	}

}
