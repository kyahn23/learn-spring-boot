package com.springbootstudy.learnspringboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootstudy.learnspringboot.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "Learn AWS", "kyahn23"));
		repository.save(new Course(2, "Learn SpringBoot", "kyahn23"));
		repository.save(new Course(3, "Learn DevOps", "kyahn23"));
		
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l)); 
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("kyahn23"));
		System.out.println(repository.findByAuthor(""));

		System.out.println(repository.findByName("Learn AWS"));
		System.out.println(repository.findByName("Learn SpringBoot"));
	}

	
}
