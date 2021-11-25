package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.InvalidCredintialException;
import com.model.Customer;
import com.model.Issue;
import com.model.Login;
import com.model.Operator;
import com.service.OperatorService;

@RestController
@RequestMapping(path="/api")
public class OperatorController {
	@Autowired
	OperatorService operatorService;
	@PostMapping("/login")
	public ResponseEntity<Login> addOperator(@RequestBody Login c) throws InvalidCredintialException
	{
		Login l1=operatorService.login(c);
		ResponseEntity re=new ResponseEntity<Login>(l1,HttpStatus.OK);
		return re;
	}
	@PostMapping("/addCustomerIssue")
	public ResponseEntity<Issue>addCustomerIssue(@RequestBody Issue issue){
		Issue i1=operatorService.addCustomerIssue(issue);
		operatorService.addCustomerIssue(issue);
		ResponseEntity re=new ResponseEntity<Issue>(i1,HttpStatus.OK);
		return re;
	}
	@PutMapping(path="/modifyCustomerIssue")
	public ResponseEntity<Issue> modifyDepartment(@RequestBody Issue issue){
		Issue i2=operatorService.modifyCustomeIssue(issue);
		ResponseEntity re= new ResponseEntity<Issue>(i2,HttpStatus.OK);
		return re;
	}
	@GetMapping(path="/getCusomer/{customerId}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable int operatorId)throws Throwable{
		int customerId = 0;
		Customer c=operatorService.findCustomerById(customerId);
		ResponseEntity re= new ResponseEntity<Customer>(c,HttpStatus.OK);
		return re;
	}
	@GetMapping(path="/getCusomer/{email}")
	public ResponseEntity<Customer> findCustomerByEmail(@PathVariable int operatorId)throws Throwable{
		int customerId = 0;
		String email = null;
		Customer c=operatorService.findCustomerByEmail(email);
		ResponseEntity re= new ResponseEntity<Customer>(c,HttpStatus.OK);
		return re;
	}
	@GetMapping("getCustomer")
	public ResponseEntity<List<Customer>> findCustomerByName(String firstName) throws Throwable{
	List<Customer> lc=operatorService.findCustomerByName(firstName);
	ResponseEntity re=new ResponseEntity<List<Customer>>(lc,HttpStatus.OK);
	return re;
	}
	@PostMapping("/closeCustomerIssue")
	public ResponseEntity<Issue>closeCustomerIssue(@RequestBody Issue issue){
		Issue i1=operatorService.addCustomerIssue(issue);
		operatorService.addCustomerIssue(issue);
		ResponseEntity re=new ResponseEntity<Issue>(i1,HttpStatus.OK);
		return re;
	}
	
}