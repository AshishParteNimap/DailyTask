package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.book;
import com.example.demo.model.student;
import com.example.demo.repo.bookRepo;
import com.example.demo.repo.studentRepo;

@Component
public class testRunner implements CommandLineRunner{

	@Autowired
	bookRepo  brpo;
	
	@Autowired
	private studentRepo srepo;
	@Override
	public void run(String... args) throws Exception {
		book bk=new book(1,"harry potter");
		book bk1=new book(2,"the secrete");
		
		brpo.save(bk);
		brpo.save(bk1);
		
		student std=new student(1, "ashish", bk);
		student std2=new student(2,"sandesh", bk1);
		
		srepo.save(std);
		srepo.save(std2);
;
	}

}
