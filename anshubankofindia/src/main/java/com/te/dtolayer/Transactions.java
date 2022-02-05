package com.te.dtolayer;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq1", initialValue = 323829700, allocationSize = 1000)
public class Transactions {
	   @Id
	   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
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
		public Transactions(long accountNumber, LocalDate date, double credit, double debit, double currentBalance,
				LocalTime time) {
			super();
			this.accountNumber = accountNumber;
			this.date = date;
			this.credit = credit;
			this.debit = debit;
			this.currentBalance = currentBalance;
			this.time = time;
		}
		public Transactions() {
			super();
			// TODO Auto-generated constructor stub
		}
		
				
	
	    
}
