package com.service;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.CustomerDao;
import com.dao.IssueDao;
import com.dao.LoginDao;
import com.exception.CustomerNotFoundException;
import com.exception.InvalidCredintialException;
import com.exception.IssueNotFoundException;
import com.model.Customer;
import com.model.Issue;
import com.model.Login;

@Service
public class OperatorService {
	@Autowired
	LoginDao repo;
	public Login login(Login c)throws InvalidCredintialException
	{
		repo.save(c);
		return c;
	}
	@Autowired
	IssueDao repo1;
	public Issue addCustomerIssue(Issue issue) {
			repo1.save(issue);
		return issue;
	}
	
	public String sendIntimationEmailToCustomer(int customerId, int issueId)throws CustomerNotFoundException, IssueNotFoundException
	{
		return "send intimation email to customer";
		
	}
	public Issue modifyCustomerIssue(int issueId,Issue issue)
	{
		Optional<Issue> optional=repo1.findById(issueId);
		if(optional.isPresent()) {
			Issue i=optional.get();
			i.setIssueId(issue.getIssueId());
			i.setIssueType(issue.getIssueType());
			i.setDescription(issue.getDescription());
			i.setIssueStatus(issue.getIssueStatus());
			return repo1.save(i);	
		}
		return null;
	}
	public String sendModificationEmailToCustomer(int customerId, int issueId)throws CustomerNotFoundException, IssueNotFoundException
	{
		return "Send modification email to customer";
		
	}
	public Issue closeCustomerIssue(Issue issue)
	{
		repo1.delete(issue);
		return issue;
	}
	@Autowired
	CustomerDao repo2;
	public Customer findCustomerById(int customerId)throws Throwable
	{
		Supplier s1= ()->new CustomerNotFoundException("customer Does not exist in the database");
		Customer c=repo2.findById(customerId).orElseThrow(s1);
		return c;
	}
	public List<Customer> findCustomerByName(String firstName)throws CustomerNotFoundException
	{
		List<Customer> c1=repo2.findAll();
		return c1;
	}
	public Customer findCustomerByEmail(String email)throws CustomerNotFoundException
	{
		Supplier s2= ()->new CustomerNotFoundException("customer Does not exist in the database");
		Customer c2=(Customer) repo2.findAll();
		return c2;
	}

	public Issue modifyCustomeIssue(Issue issue) {
	
		return null;
	}
	
}