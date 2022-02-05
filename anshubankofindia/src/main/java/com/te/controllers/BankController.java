package com.te.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.dtolayer.BankAccountDetails;
import com.te.dtolayer.MiniStatement;
import com.te.dtolayer.SignUp;
import com.te.servicelayer.ServiceInterface;

@Controller
public class BankController {
    @Autowired
	ServiceInterface service;  
    
    @GetMapping(path="/abihomepage")
	public String homepage() {
		return "abihomepage";
	}
    
	
	@GetMapping(path="/create")
	public String create() {
		return "bankForm";
	}
	
	@PostMapping(path="/createAccount")
	public String createAccount(BankAccountDetails details,ModelMap map) {
		if(service.createAccount(details)) {
			map.addAttribute("msg", "Bank account Successfully created.......");
			map.addAttribute("details", details);
		}else {
			map.addAttribute("msg", "Bank account not created,MINIMUM DEPOSITE 500,Please take your "+details.getBalance()+" rupees.....");
			map.addAttribute("details", details);
		}
		
		return "display";
	}
	
	
	@GetMapping(path="/signupform")
	public String signUpForm() {
		return "signup";
	}
	
	@PostMapping(path="/signupAccount")
	public String signupAccount(SignUp signup,ModelMap map,HttpServletRequest req) {
		String confirm=req.getParameter("confirmPassword");
		System.out.println(confirm+""+signup.getPassword());
		
		if(signup.getPassword().equals(confirm)) {
			if(service.signUpAccount(signup)) {
			map.addAttribute("msg", "You Are Successfully SignedUp.......");
			map.addAttribute("signup", signup);
		}else {
			
			map.addAttribute("msg", "You Are Invalid Account Holder Check your details......");
			map.addAttribute("signup", signup);
		}
		}
		else {
			map.addAttribute("msg", "Password and Confirm password not matched.......");
			map.addAttribute("signup", signup);
		}
		
		return "signupconfirmation";
	}
	
    @GetMapping(path="/login")
    public String login() {
    	return "login";
    }
    
    @PostMapping(path="/loginconfirmation")
    public String loginconfirmation(String userName,String password,HttpServletRequest req,ModelMap map) {
    	HttpSession session=req.getSession();
    	if(service.loginConfirmation(userName, password)) {
    		session.setAttribute("us", userName);
    		map.addAttribute("msg", "Login successfully.....");
    		return "loginconfirmation";
    	}else {
    		return "login";
    	}
    	
    }

    
    @GetMapping(path="/deposit")
    public String deposite(@SessionAttribute(name="us",required=false)String session) {
    	if(session!=null) {
    		return "deposit";
    	}else {
    		return "login";
    	}
    }
    
    @PostMapping(path="/depositAmount")
    public String depositAmount(long accountNumber,String mobileNumber,double amount,ModelMap map,@SessionAttribute(name="us",required=false)String userName) {
    	
    	
    	MiniStatement statement=service.deposit(userName,accountNumber, mobileNumber, amount);
    	if(statement!=null) {
			map.addAttribute("msg", "Your Amount Credit Successfully.....");
			map.addAttribute("amount",statement);
		}else {
			
			map.addAttribute("msg", "You Are Invalid Account Holder Check your details....,Take Your Amount....");
			map.addAttribute("amount",statement);
		}
		
    	return"depositconfirmation";    	
    }
    
    
    @GetMapping(path="/withdraw")
    public String withdraw(@SessionAttribute(name="us",required=false)String session) {
    	if(session!=null) {
    		return "withdraw";
    	}else {
    		return "login";
    	}
    }
    
    @PostMapping(path="/withdrawAmount")
    public String withdrawAmount(long accountNumber,String mobileNumber,double amount,ModelMap map,@SessionAttribute(name="us",required=false)String userName) {
    	MiniStatement statement=service.withdraw(userName,accountNumber, mobileNumber, amount);
    	if(statement!=null) {
			map.addAttribute("msg", "Take Your Amount....");
			map.addAttribute("amount",statement);
		}else {
			
			map.addAttribute("msg", " In Sufficient Funds OR You Are Invalid Account Holder Check your details.....");
			map.addAttribute("amount",statement);
		}
		
    	return"withdrawconfirmation";    	
    } 
    
    @GetMapping(path="/changepassword")
    public String changePassword(@SessionAttribute(name="us",required=false)String session) {
    	if(session!=null) {
    		return "changepassword";
    	}else {
    		return "login";
    	}
    }
    
    @PostMapping(path="/updatepassword")
    public String updatePassword(String userName,String oldPassword,String newPassword,ModelMap map,@SessionAttribute(name="us",required=false)String session) {
    	if(userName.equals(session)) {
    	
    	if(service.updatePassword(userName, oldPassword, newPassword)) {
			map.addAttribute("msg", "Your password Changed Successfully.....");
			
		}else {
			map.addAttribute("msg", "In Valid Details Your password not Updated.....");
		}
    	}else {
    		map.addAttribute("msg", "In Valid User.....");
    	}
		
    	return"passwordconfirmation";    	
    } 
    @GetMapping(path="/changemobile")
    public String changeMobile(@SessionAttribute(name="us",required=false)String session) {
    	if(session!=null) {
    		return "changemobile";
    	}else {
    		return "login";
    	}
    }
    
    @PostMapping(path="/updatemobile")
    public String updatemobile(String userName,String oldMobile,String newMobile,ModelMap map,@SessionAttribute(name="us",required=false)String session) {
    	
    	if(userName.equals(session)) {
    	if(service.updateMobile(userName, oldMobile, newMobile)) {
			map.addAttribute("msg", "Your Mobile Number Changed Successfully.....");
			
		}else {
			map.addAttribute("msg", "In Valid Details Your Mobile Number not Updated.....");
		}
    	}else {
    		 {
    				map.addAttribute("msg", "In Valid User.....");
    			}
    	}
    		
		
    	return"mobileconfirmation";    	
    } 
    	
    
    
    @GetMapping(path="/statement")
    public String getStatement(@SessionAttribute(name="us",required=false)String session) {
    	if(session!=null) {
    		return "statement";
    	}else {
    		return "login";
    	}
    			
    }
    
    @PostMapping(path="getStatement")
    public String statement(long accountNumber,ModelMap map,@SessionAttribute(name="us",required=false)String userName) {
    	List<MiniStatement> statement=service.getStatement(userName,accountNumber);
    	if(statement!=null) {
    		map.addAttribute("statement",statement);
    	}else {
    		map.addAttribute("statement",statement);
    	}
    	return "getStatement";
    }
    
    @GetMapping("/logout")
	public String logOut(@SessionAttribute(name="us",required=false) String session1,HttpServletRequest req,HttpSession session)  {
		session.getAttribute(session1);
		session.invalidate();
		return"abihomepage";
		
	}
	
	
}
