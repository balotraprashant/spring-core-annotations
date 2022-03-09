package com.hustlecrafts.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
	
	public void collegeInfo() {
		System.out.println("Hi, Welcome to " + collegeName);
		System.out.println("Pricipal name is " + principal.information());
		teacher.teach();
	}
}
