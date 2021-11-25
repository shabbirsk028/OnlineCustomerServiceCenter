package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "solution")
public class Solutions implements Serializable {
	
	private static final long serialVersionUID = -9168833388053422036L;
	@Id
	@GeneratedValue
	private int solutionId;
	private String solutionDescription;
	private Date solutionDate;
	
	@OneToOne(targetEntity=Operator.class,cascade=CascadeType.ALL)
	@JoinColumn(name="operator_id")
	private Operator specilist;
	
	 public Operator getSpecilist() {
		return specilist;
	}
	public void setSpecilist(Operator specilist) {
		this.specilist = specilist;
	}
	
	@OneToOne(targetEntity=Issue.class,cascade=CascadeType.ALL)
	@JoinColumn(name="issue_id")
	private Issue issue;
	
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	public int getSolutionId() {
		return solutionId;
	}
	public void setSolutionId(int solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionDescription() {
		return solutionDescription;
	}
	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	public Date getSolutionDate() {
		return solutionDate;
	}
	public void setSolutionDate(Date solutionDate) {
		this.solutionDate = solutionDate;
	}
	@Override
	public String toString() {
		return "Solution [solutionId=" + solutionId + ", solutionDescription=" + solutionDescription + ", solutionDate="
				+ solutionDate + ", specilist=" + specilist + ", issue=" + issue + "]";
	}
	
	
	



	}