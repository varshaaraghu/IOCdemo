package com.ioc.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ABCCompany implements Company {
	
private BuisnessOperation branch;
private BuisnessOperation manufacturing;

@Autowired
@Qualifier("tasks")
private List<Process> tasks;


public BuisnessOperation getBranch() {
	return branch;
}
public void setBranch(BuisnessOperation branch) {
	this.branch = branch;
}
public BuisnessOperation getManufacturing() {
	return manufacturing;
}
public void setManufacturing(BuisnessOperation manufacturing) {
	this.manufacturing = manufacturing;
}
	@Override
	public void establish(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "company is established");
		branch.perform("Chennai");
		manufacturing.perform("Tyre manufacturing");
		String[] tasktypes = {
				"Quarter1","Pen and pencil"
		};
		
		for(int i=0;i<tasks.size();i++) {
			tasks.get(i).process(tasktypes[i]);
		}
		System.out.println("-------------------------------------");
	}
	

}
