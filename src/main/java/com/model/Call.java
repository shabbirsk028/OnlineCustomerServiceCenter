package com.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "call")
public class Call implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7015507122597006590L;


	@Id
	@GeneratedValue
	@Column(name = "call_id")
	private int callId;
	
	
	@Column(name = "call_Date")
	private Date callDate;
	
	@Column(name = "call_Duration")
	private double callDuration;
	
	@NotNull
	@Column(name = "phone_Number")
	private String phoneNumber;
	
	
	@OneToOne(targetEntity = Operator.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "operator_id")
	private Operator operator;
	
	
	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer cu;

	@OneToOne(targetEntity = Issue.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "issu_id")
	private Issue i;

	
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public Date getCallDate() {
		return callDate;
	}
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	public double getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(double callDuration) {
		this.callDuration = callDuration;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	public Operator getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(Operator receivedBy) {
		this.receivedBy = receivedBy;
	}
	
	
	
	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callDate=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + ", customer=" + customer + ", issue=" + issue + ", receivedBy=" + receivedBy + "]";
	}



	private Customer customer;
	private Issue issue;
	private Operator receivedBy;
}