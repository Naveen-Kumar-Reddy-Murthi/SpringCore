package org.mnr.listeners;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContainerListener implements ApplicationListener {
	
	long start,end;
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Cotainer Listener class::"+event.toString());
		
		if(event.toString().indexOf("ContextRefreshedEvent")!=-1){
			start = System.currentTimeMillis();
			System.out.println("Container started at :"+new Date());
		}
		else if(event.toString().indexOf("ContextClosedEvent")!=-1){
			end = System.currentTimeMillis();
			System.out.println("Container started at :"+new Date());
			System.out.println("Container has run for :"+(end-start)+" ms");
		}
		
	}

}
