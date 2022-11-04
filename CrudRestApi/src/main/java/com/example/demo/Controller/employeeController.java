package com.example.demo.Controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.EmployeeSrvcImpl;

import com.example.demo.employeeEntity.employeeEntity;

@RestController
public class employeeController {
@Autowired
private EmployeeSrvcImpl empService;




@GetMapping("/employee")
public List<employeeEntity> getAllEmp(){
	List<employeeEntity> empEnt=empService.getAllEmployee();
	return empEnt;
}

@GetMapping("/{pageNo}/{pageSize}")
public ResponseEntity<List<employeeEntity>> getPagedEmp(@PathVariable("pageNo")Integer pageNo,@PathVariable("pageSize")Integer pageSize){
	List<employeeEntity> empList=this.empService.getAllEmpByPage(pageNo, pageSize);
	return new ResponseEntity<List<employeeEntity>>(empList,HttpStatus.OK);
}


@GetMapping("/{id}")
public ResponseEntity<employeeEntity> getEmpById(@PathVariable("id") Long empId)throws Exception{
	employeeEntity empEnt=empService.getEmployeeById(empId).orElseThrow(()->new Exception("id dosent exist"));
	var headers=new HttpHeaders();
	headers.add("Status","success");
	return ResponseEntity.accepted().headers(headers).body(empEnt);
}
@PostMapping("/employee")
public ResponseEntity<employeeEntity> addEmployee(@RequestBody employeeEntity empEnt){
	
		empService.addEmployee(empEnt);
		return  ResponseEntity.ok().body(empEnt);
}
@DeleteMapping("{id}")
public ResponseEntity<String> deleteEmp(@PathVariable("id") Long empid) throws Exception{
	
		empService.deletEmployeeById(empid);
		return ResponseEntity.ok().body("deleted");
}
@PutMapping("/{id}")
public ResponseEntity<employeeEntity> updateEmployee(@RequestBody employeeEntity empEnt,@PathVariable ("id")Long empId) throws Exception{
 employeeEntity updateEmp=empService.editEmployee(empEnt, empId);
 return ResponseEntity.ok().body(empEnt);
}
}
