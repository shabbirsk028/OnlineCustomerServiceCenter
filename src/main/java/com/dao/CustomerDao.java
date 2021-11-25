package com.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.Issue;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {


	//List<Customer> findByName(String customerName);
//	Customer findCustomerByEmail(String email);

}