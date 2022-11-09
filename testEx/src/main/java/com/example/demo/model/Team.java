package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="Team11")
@Where(clause = "is_active=true")
@SQLDelete(sql = "UPDATE Team11 set is_active=false where player_id=?")

public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Player_id")
	private Long id;
	
	@Column(name = "Player_name")
	private String name;
	
	@Column(name = "Player_role")
	private String Role;
	
	@JsonIgnore
	@Column(name="is_active")
	public Boolean is_active=true;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(Long id, String name, String role,Boolean is_active) {
		super();
		this.id = id;
		this.name = name;
		Role = role;
		this.is_active=is_active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	
	
	
	

}
