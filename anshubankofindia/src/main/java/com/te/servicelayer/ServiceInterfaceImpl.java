package com.te.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.daolayer.DaoInterface;
import com.te.dtolayer.BankAccountDetails;
import com.te.dtolayer.MiniStatement;
import com.te.dtolayer.SignUp;

@Service
public class ServiceInterfaceImpl implements ServiceInterface {

	@Autowired
	private DaoInterface dao;

	@Override
	public boolean createAccount(BankAccountDetails details) {
		// TODO Auto-generated method stub
		boolean isInserted = false;
		if (details.getBalance() >= 500) {
			isInserted = dao.createAccount(details);
		}
		return isInserted;

	}

	@Override
	public boolean signUpAccount(SignUp signUp) {
		// TODO Auto-generated method stub
		return dao.signUpAccount(signUp);
	}

	@Override
	public boolean loginConfirmation(String username, String password) {
		// TODO Auto-generated method stub
		return dao.loginConfirmation(username, password);
	}

	@Override
	public MiniStatement deposit(String userName,long accountNumber, String mobile, double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(userName,accountNumber, mobile, amount);
	}

	@Override
	public MiniStatement withdraw(String userName,long accountNumber, String mobile, double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(userName,accountNumber, mobile, amount);
	}

	@Override
	public List<MiniStatement> getStatement(String userName,long accountNumber) {
		// TODO Auto-generated method stub
		return dao.getStatement(userName,accountNumber);
	}

	@Override
	public boolean updatePassword(String userName, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return dao.updatePassword(userName, oldPassword, newPassword);
	}

	@Override
	public boolean updateMobile(String userName, String oldMobile, String newMobile) {
		// TODO Auto-generated method stub
		return dao.updateMobile(userName, oldMobile, newMobile);
	}
}
