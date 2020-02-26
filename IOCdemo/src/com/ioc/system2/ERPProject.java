package com.ioc.system2;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ioc.events.MyEventPublisher;


public class ERPProject implements Project,InitializingBean,DisposableBean {
	@Autowired
	MyEventPublisher publish;
	
	public ERPProject()
	{
		System.out.println("ERP INSTANTIATED");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("ERP Project Started");
		publish.publish("PUBLISHING EVENT");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After properties set");
	}

	
	@PreDestroy
	public void doTask() {
		System.out.println("Destroying");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying bean");
	}

	public void print() {
		System.out.println("object" + ERPProject.class);
	}

}
