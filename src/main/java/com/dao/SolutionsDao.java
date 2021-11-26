package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Solutions;

@Repository
public interface SolutionsDao extends JpaRepository<Solutions, Integer> {

}