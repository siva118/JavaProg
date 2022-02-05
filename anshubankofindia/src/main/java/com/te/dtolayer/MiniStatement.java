package com.te.dtolayer;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MiniStatement {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="S_No")
	private int id;
    @Column(name="Account_Number")
	private long accountNumber;
    @Column(name="Date")
	private LocalDate date;
    @Column(name="Credit")
	private double credit;
    @Column(name="Debit")
	private double debit;
    @Column(name="Current_Balance")
	private double currentBalance;
    @Column(name="Time")
    private LocalTime time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public MiniStatement(int id, long accountNumber, LocalDate date, double credit, double debit, double currentBalance,
			LocalTime time) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.date = date;
		this.credit = credit;
		this.debit = debit;
		this.currentBalance = currentBalance;
		this.time = time;
	}
	public MiniStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[" + ", accountNumber=" + accountNumber + ", date=" + date + ", credit=" + credit
				+ ", debit=" + debit + ", currentBalance=" + currentBalance + ", time=" + time + "]";
	}
    
		
    
}
