package com.te.daolayer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.dtolayer.BankAccountDetails;
import com.te.dtolayer.MiniStatement;
import com.te.dtolayer.SignUp;
import com.te.dtolayer.Transactions;

@Repository
public class DaoInterfaceImpl implements DaoInterface {
	 
	@PersistenceUnit
	private EntityManagerFactory factory;
	

	@Override
	public boolean createAccount(BankAccountDetails details) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		LocalDate date = LocalDate.now();
		LocalTime time=LocalTime.now();
		boolean isCreated = false;
		details.setDate(date);
		details.setTime(time);
		MiniStatement statement = new MiniStatement();
		Transactions transaction = new Transactions();

		try {

			trans.begin();

			manager.persist(details);
			trans.commit();
			statement.setDate(date);
			statement.setAccountNumber(details.getAccountNumber());
			statement.setCredit(details.getBalance());
			statement.setCurrentBalance(details.getBalance());
			statement.setTime(time);
			trans.begin();
			manager.persist(statement);
			trans.commit();
			transaction.setDate(date);
			transaction.setCredit(details.getBalance());
			transaction.setCurrentBalance(details.getBalance());
			transaction.setTime(time);
			trans.begin();
			manager.persist(transaction);
			trans.commit();
			manager.close();
			isCreated = true;

		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();

		}

		return isCreated;
	}

	@Override
	public boolean signUpAccount(SignUp signup) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		boolean isSignUp = false;
		BankAccountDetails d=manager.find(BankAccountDetails.class, signup.getAccountNumber());
		try {
			if(d!=null) {
			if(signup.getMobile().equals(d.getPhoneNumber())) {
				trans.begin();
                manager.persist(signup);
				trans.commit();
				isSignUp=true;
			}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}
		return isSignUp;
	}

	@Override
	public boolean loginConfirmation(String username, String password) {
		EntityManager manager = factory.createEntityManager();
		boolean isLogin=false;
		try {
		SignUp s=manager.find(SignUp.class, username);
		  if(s!=null) {
			if(password.equals(s.getPassword())) {
				isLogin=true;
			}
		  }
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		return isLogin;
	}

	@Override
	public MiniStatement deposit(String userName,long accountNumber, String mobile, double amount) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		LocalDate date = LocalDate.now();
		LocalTime time=LocalTime.now();
		MiniStatement statement = new MiniStatement();
		Transactions transaction = new Transactions();
		boolean isDeposit=false;
		SignUp s=manager.find(SignUp.class,userName);
		BankAccountDetails d=manager.find(BankAccountDetails.class, accountNumber);
		Transactions t=manager.find(Transactions.class, accountNumber);
		try {
			if(s!=null) {
		if(mobile.equals(s.getMobile())&&amount>=0) {
			d.setBalance(amount+d.getBalance());
			trans.begin();
			manager.persist(d);
			trans.commit();
			t.setCurrentBalance(amount+t.getCurrentBalance());
			t.setCredit(amount+t.getCredit());
			trans.begin();
			manager.persist(t);
			trans.commit();
			statement.setAccountNumber(d.getAccountNumber());
			statement.setDate(date);
			statement.setCredit(amount);
			statement.setCurrentBalance(d.getBalance());
			statement.setTime(time);
			trans.begin();
			manager.persist(statement);
			trans.commit();
			manager.close();
			isDeposit=true;
			}
			}
		}catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		if(isDeposit) {
		return statement;
		}else {
			return null;
		}
	}

	@Override
	public MiniStatement withdraw(String userName,long accountNumber, String mobile, double amount) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		LocalDate date = LocalDate.now();
		LocalTime time=LocalTime.now();
		MiniStatement statement = new MiniStatement();
		Transactions transaction = new Transactions();
		boolean isWithdraw=false;
		SignUp s=manager.find(SignUp.class,userName);
		BankAccountDetails d=manager.find(BankAccountDetails.class, accountNumber);
		Transactions t=manager.find(Transactions.class, accountNumber);
		try {
			if(s!=null&&d!=null) {
		if(mobile.equals(s.getMobile())&&amount<=d.getBalance()&&amount>=0) {
			d.setBalance(d.getBalance()-amount);
			trans.begin();
			manager.persist(d);
			trans.commit();
			t.setCurrentBalance(t.getCurrentBalance()-amount);
			t.setDebit(amount+t.getDebit());
			trans.begin();
			manager.persist(t);
			trans.commit();
			statement.setAccountNumber(d.getAccountNumber());
			statement.setDate(date);
			statement.setDebit(amount);
			statement.setCurrentBalance(d.getBalance());
			statement.setTime(time);
			trans.begin();
			manager.persist(statement);
			trans.commit();
			manager.close();
			isWithdraw=true;
			}}
		}catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		if(isWithdraw) {
		return statement;
		}else {
			return null;
		}
	}

	@Override
	public List<MiniStatement> getStatement(String UserName,long accountNumber) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		SignUp s=manager.find(SignUp.class, UserName);
		if(s!=null) {
		if(s.getAccountNumber()==accountNumber) {
		String query_ = "from MiniStatement where accountNumber =:id";
		Query query = manager.createQuery(query_);
		query.setParameter("id", accountNumber);
		List resultList = query.getResultList();

		return resultList;
		}else {
			return null;
		}}
		else {
			return null;
		}
	}

	@Override
	public boolean updatePassword(String userName, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		boolean isUpdate=false;
		SignUp s=manager.find(SignUp.class, userName);
		try {
			if(s!=null) {
			if(userName!=null && oldPassword.equals(s.getPassword())&&newPassword!=null) {
				s.setPassword(newPassword);
				trans.begin();
				manager.persist(s);
				trans.commit();
				manager.close();
				isUpdate=true;
			}
			}
			
			
		}catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		return isUpdate;
	}

	@Override
	public boolean updateMobile(String userName, String oldMobile, String newMobile) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		boolean isUpdate=false;
		SignUp s=manager.find(SignUp.class, userName);
		BankAccountDetails d=manager.find(BankAccountDetails.class, s.getAccountNumber());
		
		try {
			if(s!=null) {
			if(userName!=null && oldMobile.equals(s.getMobile())&&newMobile!=null) {
				s.setMobile(newMobile);
				d.setPhoneNumber(newMobile);
				trans.begin();
				manager.persist(s);
				trans.commit();
				trans.begin();
				manager.persist(d);
				trans.commit();
				manager.close();
				isUpdate=true;
			}
			}
			
			
		}catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return isUpdate;
		
	}

}
