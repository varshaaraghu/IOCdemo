package com.ioc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.system.Company;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
            Company company =(Company)ac.getBean("abc");
            company.establish("ABC Pvt Ltd");
            company = (Company)ac.getBean("xyz");
            company.establish("XYZ Corp");
	}

}
