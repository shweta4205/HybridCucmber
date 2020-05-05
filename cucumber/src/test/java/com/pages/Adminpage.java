package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adminpage {
	WebDriver driver;


	@FindBy(xpath="//a[contains(@href, '/index.php/admin/viewAdminModule')]")
	WebElement vis;
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement admin;
	@FindBy (id="searchSystemUser_userName")
	WebElement uname;
	@FindBy(xpath="//*[@id=\"searchSystemUser_userType\"]")
	WebElement userrole;
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement employee;
	@FindBy(xpath="//*[@id=\"searchSystemUser_status\"]")
	WebElement stat;
	@FindBy(id="searchBtn")
	WebElement search;
	@FindBy(id="btnAdd")
	WebElement add;
	@FindBy(id="systemUser_userType")
	WebElement usertype;
	@FindBy(id="systemUser_employeeName_empName")
	WebElement ename;
	@FindBy(id="systemUser_userName")
	WebElement uname1;
	@FindBy(id="systemUser_status")
	WebElement systemstatus;
	@FindBy(id="systemUser_password")
	WebElement pwd;
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpwd;
	@FindBy(id="btnSave")
	WebElement save;
	@FindBy(id="menu_admin_Qualifications")
	WebElement qualification;
	@FindBy(id="menu_admin_viewEducation")
	WebElement education;
	@FindBy(id="btnAdd")
	WebElement addb;
	@FindBy(id="education_name")
	WebElement educationname;
	@FindBy(id="btnSave")
	WebElement saveb;

	public void orangehrmAdmin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	public void clickAdmin() {
	admin.click();
	}

	public void linkvisible() {
	//vis.isEnabled();
	}
	public void typeusername(String username) {
	uname.sendKeys(username);
	}
	public void selectuserrole(String role) {

	Select urole=new Select(userrole);
	urole.selectByVisibleText(role);
	}
	public void typeemployeename(String en) {
	employee.sendKeys(en);
	}
	public void selectstatus(String status) {
	Select s=new Select(stat);
	s.selectByVisibleText(status);

	}
	public void clicksearchbutton() {
	search.click();
	}
	public void addbutton() {
	add.click();
	}
	public void userrole(String u) {
	Select role=new Select (usertype);
	role.selectByVisibleText(u);
	}
	public void selectstatus1(String status) {
	Select s =new Select(systemstatus);
	s.selectByVisibleText(status);
	}
}


	//public void clickAdmin() {
//	admin.click();
//	Actions action=new Actions(driver);
//	action.moveToElement(qualification).click().build().perform();
//	System.out.println("The qualification is clicked");
//	action.moveToElement(education).click().build().perform();
//	addb.click();
	//educationname.sendKeys("masters");
	


