package com.hustlecrafts.spring;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi, I am Maths Teacher");
	}

}
