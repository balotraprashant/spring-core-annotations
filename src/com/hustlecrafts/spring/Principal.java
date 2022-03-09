package com.hustlecrafts.spring;

import org.springframework.stereotype.Component;

@Component
public class Principal {
	String name = "James Bond";
	
	public String information(){
		return name;
	}
}
