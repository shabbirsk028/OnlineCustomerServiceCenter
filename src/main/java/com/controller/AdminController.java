package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Operator;
import com.service.AdminService;

@RestController
@RequestMapping(path="/api")

public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addDepartment")
	public ResponseEntity<Boolean> addDepartment(@RequestBody Department department){
		adminService.addDepartment(department);
		ResponseEntity re=new ResponseEntity<Boolean>(true,HttpStatus.OK);
		return re;	
	}
	@DeleteMapping(path="/removeDepartment/{departmentId}")
	public ResponseEntity<Boolean> removeDepartment(@PathVariable int departmentId)throws Throwable{
		adminService.removeDepartment(departmentId);
		ResponseEntity re=new ResponseEntity<Boolean>(true,HttpStatus.OK);
		return re;
	}
	@PutMapping(path="/modifyDepartment")
	public ResponseEntity<Department> modifyDepartment(@RequestBody Department department){
		Department d=adminService.modifyDepartment(department);
		ResponseEntity re= new ResponseEntity<Department>(d,HttpStatus.OK);
		return re;
		
	}
	@GetMapping(path="/getDepatment/{departmentId}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable int departmentId)throws Throwable{
		Department d=adminService.findDepartmentById(departmentId);
		ResponseEntity re= new ResponseEntity<Department>(d,HttpStatus.OK);
		return re;
	}
	@PostMapping("/addOperator")
	public ResponseEntity<Boolean> addOperator(@RequestBody Operator operator){
		adminService.addOperator(operator);
		ResponseEntity re=new ResponseEntity<Boolean>(true,HttpStatus.OK);
		return re;	
	}
	@DeleteMapping(path="/removeOperator/{operatorId}")
	public ResponseEntity<Boolean> removeOperator(@PathVariable int operatorId)throws Throwable{
		adminService.removeOperator(operatorId);
		ResponseEntity re=new ResponseEntity<Boolean>(true,HttpStatus.OK);
		return re;
	}
	@PutMapping(path="/modifyOperator")
	public ResponseEntity<Operator> modifyOperator(@RequestBody Operator operator){
		Operator o=adminService.modifyOperator(operator);
		ResponseEntity re= new ResponseEntity<Operator>(o,HttpStatus.OK);
		return re;
		
	}
	@GetMapping(path="/getOperator/{operatorId}")
	public ResponseEntity<Operator> findOperatorById(@PathVariable int operatorId)throws Throwable{
		Operator o=adminService.findOperatorById(operatorId);
		ResponseEntity re= new ResponseEntity<Operator>(o,HttpStatus.OK);
		return re;
	}
	@GetMapping("getOperators")
	public ResponseEntity<List<Operator>> findAllOperators(){
	List<Operator> lo=adminService.findAllOperators();
	ResponseEntity re=new ResponseEntity<List<Operator>>(lo,HttpStatus.OK);
	return re;
}
}