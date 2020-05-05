package com.stepdefintion;

import com.baseclass.Library;
import com.pages.Adminpage;
import com.pages.Orangelogin;


import cucumber.api.java.en.Then;

public class orangehrmloginstep1 extends Library {
	Adminpage QA;
	Orangelogin login1;
	
	
	@Then("^Click on admin$")
	public void click_on_admin() {
	QA=new Adminpage ();
	QA.clickAdmin();

	}

	@Then("^Enter \"([^\"]*)\"$")
	public void enter(String username) throws Throwable {
	QA.typeusername(username);
	}

	@Then("^Enter Userrole \"([^\"]*)\"$")
	public void enter_Userrole(String role) throws Throwable {
	QA.selectuserrole(role);
	}

	@Then("^Enter EmployeeName\"([^\"]*)\"$")
	public void enter_EmployeeName(String en) throws Throwable {
	QA.typeemployeename(en);
	}

	@Then("^Enter Status \"([^\"]*)\"$")
	public void enter_Status(String status) throws Throwable {
	QA.selectstatus(status);
	}

	@Then("^Click on search button$")
	public void click_on_search_button1() {
	QA.clicksearchbutton();

	}
	

	

	    



}
