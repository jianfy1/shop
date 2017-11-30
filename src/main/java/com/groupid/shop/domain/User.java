package com.groupid.shop.domain;

import java.time.LocalDateTime;

/**
 * @author Fu Yingjian
 * @date 2017/11/22
 */

public class User {

	private String userId;
	private String password;
	private String userName;
	private String phoneNumber;
	private String email;
	private int sex;
	private LocalDateTime birthday;
	private String homeAddress;
	private int isDeleted;
	private LocalDateTime GmtCreate;
	private LocalDateTime GmtModified;

	User() {
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", userName=" + userName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", sex=" + sex + ", birthday=" + birthday + ", homeAddress="
				+ homeAddress + ", isDeleted=" + isDeleted + ", GmtCreate=" + GmtCreate + ", GmtModified=" + GmtModified
				+ "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public LocalDateTime getGmtCreate() {
		return GmtCreate;
	}

	public void setGmtCreate(LocalDateTime gmtCreate) {
		GmtCreate = gmtCreate;
	}

	public LocalDateTime getGmtModified() {
		return GmtModified;
	}

	public void setGmtModified(LocalDateTime gmtModified) {
		GmtModified = gmtModified;
	}

}
