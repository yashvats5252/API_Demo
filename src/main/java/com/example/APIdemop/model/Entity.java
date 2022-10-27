package com.example.APIdemop.model;

import org.springframework.stereotype.Component;

@Component
public class Entity {
	
	private int r;

	public Entity(int r) {
		super();
		this.r = r;
	}

	public Entity() {
		super();
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}

	

}
