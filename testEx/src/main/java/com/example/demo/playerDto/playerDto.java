package com.example.demo.playerDto;

public class playerDto {
private Long id;
private String name;
private String role;


public playerDto() {
	super();
}
public playerDto(Long id, String name, String role) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
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
	return role;
}
public void setRole(String role) {
	this.role = role;
}




}
