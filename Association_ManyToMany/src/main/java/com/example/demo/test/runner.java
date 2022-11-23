package com.example.demo.test;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.model.Student;
import com.example.demo.repo.bookRepo;
import com.example.demo.repo.studentRepo;

@Component
public class runner implements CommandLineRunner{

	@Autowired
	private studentRepo Srepo;
	
	@Autowired
	private bookRepo Brepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Book book=new Book(1, "mrutyunjay");
		Book book2=new Book(2, "chava");
		Book book3=new Book(3, "yugandhar");
		
		Brepo.save(book);
		Brepo.save(book2);
		Brepo.save(book3);
		
		Set<Book> bk=Set.of(book,book2,book3);
		Set<Book> bk2=Set.of(book2,book);
		
		Student std=new Student(1, "ashish",bk );
		Student std2=new Student(2, "sandesh", bk2);
		
		Srepo.save(std);
		Srepo.save(std2);
		
	}

}

