package com.example.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;
import com.example.demo.employeeEntity.employeeEntity;

@Service
public class EmployeeSrvcImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public List<employeeEntity> getAllEmployee() {
		List<employeeEntity> emp=empRepo.findAll();
		return emp;
	}

	@Override
	public Optional<employeeEntity> getEmployeeById(Long empId) {
		Optional<employeeEntity> emp=empRepo.findById(empId);
		
		return emp;
	}

	@Override
	public employeeEntity addEmployee(employeeEntity employeeEnt)
	{
		employeeEntity emp=new employeeEntity();
		emp.setActive(employeeEnt.isActive());
				empRepo.save(employeeEnt);
		return emp;
	}

	@Override
	public employeeEntity editEmployee(employeeEntity employeeEnt, Long empId) throws Exception {
		employeeEntity empUpdate=empRepo.findById(empId).orElseThrow(()->new Exception("no employee with given id"));
		empUpdate.setEmpId(employeeEnt.getEmpId());
		empUpdate.setName(employeeEnt.getName());
		empUpdate.setProfile(employeeEnt.getProfile());
		empRepo.save(empUpdate);
		return employeeEnt;
	}

	@Override
	public void deletEmployeeById(Long empId) throws Exception{
		employeeEntity empDelete=empRepo.findById(empId).orElseThrow(()->new Exception("no employee with given id"));
		empRepo.deleteById(empId);
		
	}

	@Override
	public List<employeeEntity> getAllEmpByPage(Integer pageNo, Integer pageSize) {
		
		org.springframework.data.domain.Pageable pageable=PageRequest.of(pageNo-1, pageSize);
		Page<employeeEntity> pageResult=this.empRepo.findAll(pageable);
		List<employeeEntity> listEmp=pageResult.getContent();
		return listEmp;
	}



}
