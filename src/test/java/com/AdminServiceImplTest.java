package com;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dao.AdminDao;
import com.dao.OperatorDao;
import com.model.Department;
import com.model.Operator;
import com.service.AdminService;

@SpringBootTest
public class AdminServiceImplTest {
	@Autowired
	AdminService adminService;
	@MockBean
	AdminDao dao;
	@MockBean
	OperatorDao dao1;

	@Test
	void testAddDepartment() {
		Department d1 = new Department();
		d1.setDepartmentId(1);
		d1.setDepartmentName("Shabbir");
		Mockito.when(dao.save(d1)).thenReturn(d1);
		assertTrue(adminService.addDepartment(d1));
	}

	@Test
	void testRemoveDepartment() throws Throwable {
		Department d1 = new Department();
		d1.setDepartmentId(1);
		Optional<Department> d2 = Optional.of(d1);
		Mockito.when(dao.findById(1)).thenReturn(d2);
		Mockito.when(dao.existsById(d1.getDepartmentId())).thenReturn(false);
		assertFalse(dao.existsById(d1.getDepartmentId()));

	}

	@Test
	void testModifyDepartment() {
		Department d1 = new Department();
		d1.setDepartmentId(1);
		d1.setDepartmentName("shabbir");
		Optional<Department> d2 = Optional.of(d1);
		Mockito.when(dao.findById(1)).thenReturn(d2);
		Mockito.when(dao.save(d1)).thenReturn(d1);
		d1.setDepartmentName("shaik");
		assertThat(adminService.modifyDepartment(d1)).isEqualTo(d1);
	}

	@Test
	void testFindDepartmentById() throws Throwable {
		Department d1 = new Department();
		d1.setDepartmentId(1);
		d1.setDepartmentName("shaik");
		Optional<Department> d2 = Optional.of(d1);
		Mockito.when(dao.findById(1)).thenReturn(d2);
		assertThat(adminService.findDepartmentById(1)).isEqualTo(d1);
	}

	@Test
	void testAddOperator() {
		Operator o1 = new Operator();
		o1.setFirstName("shaik");
		o1.setLastName("shabbbir");
		o1.setCity("chennai");
		o1.setEmail("shabbirsk098@gmail.com");
		o1.setMobile("6281123615");
		o1.setOperatorId(2);
		Mockito.when(dao1.save(o1)).thenReturn(o1);
		assertTrue(adminService.addOperator(o1));
	}

	@Test
	void testRemoveOperator() throws Throwable {
		Operator o1 = new Operator();
		o1.setOperatorId(2);
		Optional<Operator> o2 = Optional.of(o1);
		Mockito.when(dao1.findById(1)).thenReturn(o2);
		Mockito.when(dao1.existsById(o1.getOperatorId())).thenReturn(false);
		assertFalse(dao1.existsById(o1.getOperatorId()));

	}

	@Test
	void testModifyOperator() {
		Operator o1 = new Operator();
		o1.setOperatorId(2);
		o1.setFirstName("shaik");
		o1.setLastName("shabbir");
		o1.setCity("chennai");
		Optional<Operator> o2 = Optional.of(o1);
		Mockito.when(dao1.findById(2)).thenReturn(o2);
		Mockito.when(dao1.save(o1)).thenReturn(o1);
		o1.setFirstName("shabbir");
		o1.setLastName("shaik");
		o1.setCity("telangana");
		assertThat(adminService.modifyOperator(o1)).isEqualTo(o1);
	}

	@Test
	void testFindAllOperators() {
		Operator o1 = new Operator();
		o1.setCity("ap");
		o1.setEmail("shabbirsk028@gmail.com");
		o1.setFirstName("shaik");
		o1.setLastName("shabbir");
		o1.setMobile("9505593009");
		o1.setOperatorId(1);

		Operator o2 = new Operator();
		o2.setCity("ap");
		o2.setEmail("shabbirsk028@gmail.com");
		o2.setFirstName("shaik");
		o2.setLastName("shabbir");
		o2.setMobile("9505593009");
		o2.setOperatorId(1);
		List<Operator> operatorList = new ArrayList<>();
		operatorList.add(o1);
		operatorList.add(o2);
		Mockito.when(dao1.findAll()).thenReturn(operatorList);
		assertThat(adminService.findAllOperators()).isEqualTo(operatorList);

	}

}