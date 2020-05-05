package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangelogin {
	WebDriver driver;
	@FindBy (id ="txtUsername")
	WebElement uname;
	
	@FindBy (id ="txtPassword")
	WebElement pwd;
	
	@FindBy (className="button")
	WebElement Loginbutton;
	
	public Orangelogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void Orangehrmlogin1(String username,String password) {
	
	uname.sendKeys(username);
	pwd.sendKeys(password);
	Loginbutton.click();

	}
}
