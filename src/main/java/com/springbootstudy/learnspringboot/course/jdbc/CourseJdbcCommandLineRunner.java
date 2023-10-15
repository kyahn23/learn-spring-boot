package com.springbootstudy.learnspringboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootstudy.learnspringboot.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1, "Learn AWS", "kyahn23"));
		repository.insert(new Course(2, "Learn SpringBoot", "kyahn23"));
		
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2)); 
	}

	
}
