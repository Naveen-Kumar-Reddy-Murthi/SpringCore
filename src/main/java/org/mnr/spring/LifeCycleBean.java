package org.mnr.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements InitializingBean,DisposableBean{

	private int id;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LifeCycleBean [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void customInit(){
    	System.out.println("LifeCycleBean-customInit method called ");
    }
    public void customDestroy(){
    	System.out.println("LifeCycleBean-customDestroy method called");
    }
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called ");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("LifeCycleBean-destroy method called");
		
	}
}
