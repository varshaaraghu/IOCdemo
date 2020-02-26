package com.ioc.events;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationEventPublisher;

import org.springframework.context.ApplicationEventPublisherAware;

import org.springframework.stereotype.Component;



@Component

public class MyEventPublisher implements ApplicationEventPublisherAware {

@Autowired

	private ApplicationEventPublisher publisher;

	

	@Override

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {

		// TODO Auto-generated method stub

		this.publisher=publisher;

	}

	

	public void publish(String n){

	     MyEvent event=new MyEvent(n);

	     publisher.publishEvent(event);

	}



}