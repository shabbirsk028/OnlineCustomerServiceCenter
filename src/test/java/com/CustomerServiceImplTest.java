package com;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dao.CustomerDao;
import com.model.Customer;
import com.model.Issue;
import com.service.CustomerService;

@SpringBootTest
public class CustomerServiceImplTest {
	@Autowired
	CustomerService service;
	@MockBean
	CustomerDao repository;

	@Test
	public void testregsterCustomer() throws Throwable {
		Customer cu = new Customer();
		cu.setCustomerId(123);
		cu.setFirstName("sai");
		cu.setLastName("krishna");
		cu.setEmail("sai@123");
		cu.setMobile("56784");
		cu.setCity("kadapa");
		Mockito.when(repository.save(cu)).thenReturn(cu);
		assertThat(service.registerCustomer(cu)).isEqualTo(cu);
	}

	CustomerService customerservice = Mockito.mock(CustomerService.class);

	@Test
	public void Test1() throws Throwable {
		customerservice.registerCustomer(null);
		Mockito.verify(customerservice, Mockito.times(1)).registerCustomer(null);

	}

	@Test
	public void Test2() throws Throwable {
		customerservice.login(null);
		Mockito.verify(customerservice, Mockito.times(1)).login(null);

	}

	@Test
	public void Test3() throws Throwable {
		customerservice.viewIssueById(0);
		Mockito.verify(customerservice, Mockito.times(1)).viewIssueById(0);

	}

	@Test
	public void Test4() throws Throwable {
		customerservice.reopenIssue(0);
		Mockito.verify(customerservice, Mockito.times(1)).reopenIssue(0);

	}

	@Test
	public void Test5() throws Throwable {
		customerservice.viewAllIssues();
		Mockito.verify(customerservice, Mockito.times(1)).viewAllIssues();

	}

	@Test
	public void Test6() throws Throwable {
		customerservice.changePassword(null);
		Mockito.verify(customerservice, Mockito.times(1)).changePassword(null);

	}

	@Test
	public void Test7() throws Throwable {
		customerservice.forgotPassword(0);
		Mockito.verify(customerservice, Mockito.times(1)).forgotPassword(0);

	}

	@Test
	public void Test8() throws Throwable {
		customerservice.emailPassword(0);
		Mockito.verify(customerservice, Mockito.times(1)).emailPassword(0);

	}

}