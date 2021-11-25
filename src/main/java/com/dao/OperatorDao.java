package com.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Operator;
@Repository
public interface OperatorDao extends JpaRepository<Operator, Integer> {

}