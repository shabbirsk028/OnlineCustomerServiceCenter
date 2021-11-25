package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Customer;
import com.model.Issue;
@Repository
public interface IssueDao extends JpaRepository<Issue, Integer> {

}