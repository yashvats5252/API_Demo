package com.example.APIdemop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.APIdemop.model.Entity;
import com.example.APIdemop.service.AreaofCircle;

@RestController
public class APIController {

	@Autowired
	AreaofCircle ac;
	
	@PostMapping("/areaofcircle")
	public void areaofcircle(@RequestBody Entity en) {
		System.out.println("Area of Circle ="+ac.areac(en));
		
		
		
	}
	
	
	
}
