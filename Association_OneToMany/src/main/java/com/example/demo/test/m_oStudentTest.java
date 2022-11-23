package com.example.demo.test;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.model.Student;
import com.example.demo.repo.m_oBookRepo;
import com.example.demo.repo.m_oStudentRepo;

@Component
public class m_oStudentTest implements CommandLineRunner{

	@Autowired
	m_oStudentRepo studentR;
	
	@Autowired
	m_oBookRepo bookR;
	@Override
	public void run(String... args) throws Exception {
		
		
		Book book=new Book(1, "harry potter");
		Book book2=new Book(2,"the secrete");
		
		bookR.save(book);
		bookR.save(book2);
		
		Set<Book> bk=Set.of(book,book2);
		
		Student std=new Student(1, "ashish", bk);
		studentR.save(std);
;
		
	}

}
