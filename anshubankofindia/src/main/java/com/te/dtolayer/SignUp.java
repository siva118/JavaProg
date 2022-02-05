package com.te.dtolayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
	@Id
	@Column(name="User_Name")
	private String userName;
	@Column(name="Account_Number")
	private long accountNumber;
	@Column(name="Password")
	private String password;
	@Column(name="Mobile_Number")
	private String mobile;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public SignUp(String userName, long accountNumber, String password, String mobile) {
		super();
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.password = password;
		this.mobile = mobile;
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SignUp [userName=" + userName + ", accountNumber=" + accountNumber + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}
	

}
