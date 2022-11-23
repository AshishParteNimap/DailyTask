package com.example.demo.model;

import java.awt.print.Book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class student {

	@Id
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "B_id")
	private book bk;
	
}
