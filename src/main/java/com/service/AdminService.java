package com.service;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.dao.OperatorDao;
import com.exception.DepartmentNotFoundException;
import com.exception.OperatorNotFoundException;
import com.model.Department;
import com.model.Operator;

@Service
public class AdminService {
	@Autowired
	AdminDao dao;
	//add department
	public boolean addDepartment(Department department) {
		dao.save(department);
		return true;
	}
	//remove department
	public boolean removeDepartment(int departmentId)throws Throwable{
		Supplier s1= ()->new DepartmentNotFoundException("department Does not exist in the database");
		Department d=dao.findById(departmentId).orElseThrow(s1);
		return true;
	}
	//modify departmnet
	public Department modifyDepartment(Department department) {
		int departmentId=department.getDepartmentId();
		Optional<Department> optional=dao.findById(departmentId);
		if(optional.isPresent()) {
			Department d=optional.get();
			d.setDepartmentName(department.getDepartmentName());
			d.setDepartmentId(department.getDepartmentId());
			return dao.save(d);	
		}
		return null;
		
	}
	//finding department by id
	public Department findDepartmentById(int departmentId)throws Throwable{
		Supplier s1= ()->new DepartmentNotFoundException("department Does not exist in the database");
		Department d=dao.findById(departmentId).orElseThrow(s1);
		return d;
	}
	@Autowired
	OperatorDao op;
	//add operator
	public boolean addOperator(Operator operator) {
		op.save(operator);
		return true;
		
	}
	//remove operator
	public boolean removeOperator(int operatorId)throws Throwable{
		Supplier s1= ()->new DepartmentNotFoundException("departmetn Does not exist in the database");
		Operator d=op.findById(operatorId).orElseThrow(s1);
		return true;
	}
	//modify operator
	public Operator modifyOperator(Operator operator) {
		int operatorId=operator.getOperatorId();
		Optional<Operator> optional=op.findById(operatorId);
		if(optional.isPresent()) {
			Operator o=optional.get();
			o.setFirstName(operator.getFirstName());
			o.setLastName(operator.getLastName());
			o.setOperatorId(operator.getOperatorId());
			o.setEmail(operator.getEmail());
			o.setMobile(operator.getMobile());
			o.setCity(operator.getCity());
			o.setDepartment(operator.getDepartment());
			return op.save(o);
		}
		return null;
	}
	//finding operator by id
	public Operator findOperatorById(int operatorId)throws Throwable{
		Supplier s1= ()->new OperatorNotFoundException("department Does not exist in the database");
		Operator d=op.findById(operatorId).orElseThrow(s1);
		return d;
	}
	//finding all operators
	public List<Operator> findAllOperators(){
		List<Operator> op1=op.findAll();
		return op1;
		
	}
}