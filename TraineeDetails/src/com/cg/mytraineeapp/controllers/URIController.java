package com.cg.mytraineeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mytraineeapp.beans.Trainee;
@Controller
public class URIController {
	
@RequestMapping(value="/")
public String getIndexPage() {
	return "indexPage";
}

@RequestMapping(value="/login")
public String getLoginPage() 
{	return "loginPage";
}
@RequestMapping(value="/transaction")
public String getTransactionPage() {
	return "transactionPage";
}
@RequestMapping(value="/registeration")
public String getRegisterationPage() {
	return "registerationPage";
}
//
@RequestMapping(value="/update")
public String getDepositPage() {
	return "updatePage";
}
//
@RequestMapping(value="/delete")
public String getDeletePage() {
	return "deletePage";
}
//@RequestMapping(value="/transfer")
//public String getTransferPage() {
//	return "transferPage";
//}
@ModelAttribute("trainee")
public Trainee getTrainee() {
	return new Trainee();
}
}
