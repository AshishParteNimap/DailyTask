package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employeeEntity.employeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<employeeEntity, Long>{

	
	
}
