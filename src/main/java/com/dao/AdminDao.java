package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Department;

@Repository
public interface AdminDao extends JpaRepository<Department, Integer> {

}