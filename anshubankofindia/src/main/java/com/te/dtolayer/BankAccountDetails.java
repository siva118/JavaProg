package com.te.dtolayer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SequenceGenerators;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@SequenceGenerator(name = "seq", initialValue = 323829700, allocationSize = 1000)
public class BankAccountDetails {
	@Id
	@Column(name = "Account_Number")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private long accountNumber;
	@Column(name = "Name")
	private String name;
	@Column(name = "Phone_Number")
	private String phoneNumber;
	@Column(name = "Adhar_Number")
	private String adharNumber;
	@Column(name = "Mail_Id")
	private String mailId;
	@Column(name = "Location")
	private String location;
	@Column(name = "Balance")
	private double balance;
	@Column(name = "Date")
	private LocalDate date;
	@Column(name="Time")
	private LocalTime time;

	@Override
	public String toString() {
		return "BankAccountDetails [accountNumber=" + accountNumber + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", adharNumber=" + adharNumber + ", mailId=" + mailId + ", location=" + location + ", balance="
				+ balance + ", date=" + date + ", time=" + time + "]";
	}
	public BankAccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccountDetails(long accountNumber, String name, String phoneNumber, String adharNumber, String mailId,
			String location, double balance, LocalDate date, LocalTime time) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adharNumber = adharNumber;
		this.mailId = mailId;
		this.location = location;
		this.balance = balance;
		this.date = date;
		this.time = time;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

	

}
