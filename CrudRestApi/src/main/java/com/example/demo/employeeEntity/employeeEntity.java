package com.example.demo.employeeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
@Entity
@Table(name="Employee")
@Where(clause = "is_active=true")
@SQLDelete(sql = "UPDATE Employee set is_active=false WHERE emp_id=?")
public class employeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Emp_id")
	private Long empId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Profile")
	private String profile;
	
	@Column(name="IsActive")
	private Boolean isActive=true;

	 public employeeEntity() {
		
	}
	
	 public employeeEntity(Long empId, String name, String profile, Boolean isActive) {
			super();
			this.empId = empId;
			this.name = name;
			this.profile = profile;
			this.isActive = isActive;
		}

	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Boolean isActive() {
		return isActive;
	}

	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}
	}


