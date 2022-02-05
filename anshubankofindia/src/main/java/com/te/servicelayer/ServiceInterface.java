package com.te.servicelayer;

import java.util.List;

import com.te.dtolayer.BankAccountDetails;
import com.te.dtolayer.MiniStatement;
import com.te.dtolayer.SignUp;

public interface ServiceInterface {
	public boolean createAccount(BankAccountDetails details);
	public boolean signUpAccount(SignUp signUp);
	public boolean loginConfirmation(String username,String password);
	public MiniStatement deposit(String userName,long accountNumber,String mobile,double amount);
	public MiniStatement withdraw(String userName,long accountNumber,String mobile,double amount);
	public List<MiniStatement> getStatement(String userName,long accountNumber);
	public boolean updatePassword(String userName,String oldPassword,String newPassword);
	public boolean updateMobile(String userName,String oldMobile,String newMobile);
	
}
