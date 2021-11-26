package com;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.service.OperatorService;

public class OperatorServiceImplTest {
	OperatorService operatorservice = Mockito.mock(OperatorService.class);
	
	@Test
	public void Test1() throws Throwable {
		operatorservice.login(null);
		Mockito.verify(operatorservice, Mockito.times(1)).login(null);

	}
	
	@Test
	public void Test2() throws Throwable {
		operatorservice.addCustomerIssue(null);
		Mockito.verify(operatorservice, Mockito.times(1)).addCustomerIssue(null);

	}
	
	@Test
	public void Test3() throws Throwable {
		operatorservice.sendIntimationEmailToCustomer(0, 0);
		Mockito.verify(operatorservice, Mockito.times(1)).sendIntimationEmailToCustomer(0, 0);

	}
	
	@Test
	public void Test4() throws Throwable {
		operatorservice.modifyCustomeIssue(null);
		Mockito.verify(operatorservice, Mockito.times(1)).modifyCustomeIssue(null);

	}
	
	@Test
	public void Test5() throws Throwable {
		operatorservice.sendModificationEmailToCustomer(0, 0);
		Mockito.verify(operatorservice, Mockito.times(1)).sendModificationEmailToCustomer(0, 0);

	}
	
	@Test
	public void Test6() throws Throwable {
		operatorservice.closeCustomerIssue(null);
		Mockito.verify(operatorservice, Mockito.times(1)).closeCustomerIssue(null);

	}
	
	@Test
	public void Test7() throws Throwable {
		operatorservice.findCustomerById(0);
		Mockito.verify(operatorservice, Mockito.times(1)).findCustomerById(0);

	}
	
	@Test
	public void Test8() throws Throwable {
		operatorservice.findCustomerByName(null);
		Mockito.verify(operatorservice, Mockito.times(1)).findCustomerByName(null);

	}
	
	@Test
	public void Test9() throws Throwable {
		operatorservice.findCustomerByEmail(null);
		Mockito.verify(operatorservice, Mockito.times(1)).findCustomerByEmail(null);

	}
	
	
}