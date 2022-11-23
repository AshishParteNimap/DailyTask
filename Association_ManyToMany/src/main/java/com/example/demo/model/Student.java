package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "NewStudent")
public class Student {

	@Id
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "StudentBooks",
	joinColumns = @JoinColumn(name="s_id"),
	inverseJoinColumns = @JoinColumn(name="b_id"))
	private Set<Book> books;
	
	
}
