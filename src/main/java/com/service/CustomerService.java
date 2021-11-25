package com.service;


import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.CustomerDao;
import com.dao.IssueDao;
import com.dao.LoginDao;
import com.exception.DuplicateCustomerException;
import com.exception.InvalidCredintialException;
import com.exception.IssueNotFoundException;

import com.model.Customer;
import com.model.Issue;
import com.model.Login;


@Service
public class CustomerService {
	@Autowired
	CustomerDao repo;
	public Customer registerCustomer(Customer customer) throws Throwable
	{
		Supplier s1= ()->new DuplicateCustomerException("Already  exist in the database");
		repo.save(customer);
		return customer;
	}
	
	@Autowired
	IssueDao repo1;
	public List<Issue> viewAllIssues()
	{
		List<Issue> lc1=repo1.findAll();
		return lc1;
	}
	
	public Issue viewIssueById(int issueId) throws Throwable 
	{
		Supplier s1= ()->new IssueNotFoundException("Issue Does not exist in the database");
		Issue c=repo1.findById(issueId).orElseThrow(s1);
		return c;
	}
	
	public Issue reopenIssue(int issueId) throws Throwable
	{
		Supplier s1= ()->new IssueNotFoundException("Issue Does not exist in the database");
		Issue c=repo1.findById(issueId).orElseThrow(s1);
		return c;	
	}
	@Autowired
	LoginDao repo2;
	
	public String login(Login login)throws InvalidCredintialException
	
	{	
	repo2.save(login);
	return "login success";
	}
	public Login changePassword(Login userName) {
		repo2.save(userName);
		return userName;
	}
	
	@Autowired
	CustomerDao rep;
	public Customer emailPassword(int customerId) {
		
		Customer c=rep.getById(customerId);
		return c;
	}
	public String forgotPassword(int customerId) {
		rep.findById(customerId);
		return"forgot password";
	}

	}
