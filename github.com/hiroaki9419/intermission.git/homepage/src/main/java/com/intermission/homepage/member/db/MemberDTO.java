package com.intermission.homepage.member.db;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String name;
	private String password;
	private String email;
	private Date joinDate;
	private String picture;
	private String approvalStatus;
	private String approvalKey;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getApprovalKey() {
		return approvalKey;
	}
	public void setApprovalKey(String approvalKey) {
		this.approvalKey = approvalKey;
	}
	
	
}
