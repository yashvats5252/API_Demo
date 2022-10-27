package com.example.APIdemop.service;

import org.springframework.stereotype.Component;

import com.example.APIdemop.model.Entity;

@Component
public class AreaofCircle {
	
	public double areac(Entity en) {
		
		double area= 3.14* en.getR()*en.getR();
		
		return area;
		
	}
	
	

}
