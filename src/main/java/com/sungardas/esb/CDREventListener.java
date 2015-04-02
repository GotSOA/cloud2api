package com.sungardas.esb;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CDREventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Event is: " + event.toString());
		
	}	
	
}
