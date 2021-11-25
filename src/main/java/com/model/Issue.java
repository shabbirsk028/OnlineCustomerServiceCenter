package com.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issue")
public class Issue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8769003483317149895L;

	@Id 
	@GeneratedValue
	@Column(name = "issue_id")
	private String issueId;
	
	@Column(name = "issue_type")
	private String issueType;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "issue_status")
	private String issueStatus;
	
	
	
	
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", description=" + description
				+ ", issueStatus=" + issueStatus + "]";
	}

}