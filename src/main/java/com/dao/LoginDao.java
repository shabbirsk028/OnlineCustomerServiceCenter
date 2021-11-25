package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Login;
@Repository
public interface LoginDao extends JpaRepository<Login, Integer> {

//Login changePassword(Login login);
	//Login save(String login);

}