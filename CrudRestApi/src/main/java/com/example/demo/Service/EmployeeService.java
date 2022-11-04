package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.domain.Page;

import com.example.demo.employeeEntity.employeeEntity;

public interface EmployeeService {

	List<employeeEntity> getAllEmployee();
	
	List<employeeEntity> getAllEmpByPage(Integer pageNo,Integer pageSize);
	
	
	Optional<employeeEntity> getEmployeeById(Long empId);
	
	
	
	employeeEntity addEmployee(employeeEntity employeeDto);
	
	employeeEntity editEmployee(employeeEntity employeeDto,Long empId) throws Exception;
	
	void deletEmployeeById(Long empId) throws Exception;
}
