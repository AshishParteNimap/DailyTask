package com.role_base.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "User_Auth_tbl")
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String username;
	private String password;
	private boolean isActive;
	private String roles;
}
