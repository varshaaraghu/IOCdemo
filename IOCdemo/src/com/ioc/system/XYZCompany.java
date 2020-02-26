package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZCompany implements Company {
	
	private BuisnessOperation branch;
	private BuisnessOperation manufacturing;
	
	@Autowired
	private Process accounting;
	
	@Autowired
	private Process production;
	
    public XYZCompany(BuisnessOperation branch,BuisnessOperation manufacturing) {
    	super();
    	this.branch=branch;
    	this.manufacturing=manufacturing;
    }
	
	
	@Override
	public void establish(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "Registered and Started");
		branch.perform("Bangalore");
		manufacturing.perform("Matchstick manufacturing");
		accounting.process("Second Quarter");
		production.process("3 million");
	}

}
