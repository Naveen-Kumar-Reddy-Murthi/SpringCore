package org.mnr.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl  implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization-beanName:"+beanName);
		System.out.println("postProcessBeforeInitialization-bean:"+bean.toString());
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization-beanName:"+beanName);
		System.out.println("postProcessAfterInitialization-bean:"+bean.toString());
		return bean;
	}

}
