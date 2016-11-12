package org.mnr.spring;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Object>{

	@Override
	public Object getObject() throws Exception {
		
		return new String("Naveen");
	}

	@Override
	public Class<String> getObjectType() {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
