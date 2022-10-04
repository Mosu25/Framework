package com.mosu.pages;

import org.openqa.selenium.By;

import com.mosu.driver.DriverManager;


public final class OrangeHRMLoginPage {
	
	
	private final By txtbox_username=By.name("username");
	private final By txtbox_password=By.xpath("input[@name='password'] and [@type='password']");
	private final By btnlogin = By.xpath("//button[text()=' Login ']");


	public OrangeHRMLoginPage enterUserName(String userName) {

		DriverManager.getDriver().findElement(txtbox_username).sendKeys(userName);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {

		DriverManager.getDriver().findElement(txtbox_password).sendKeys(password);
		return this;

	}

	public HRMHomePage clickLogin() {

		DriverManager.getDriver().findElement(btnlogin).click();
		return new HRMHomePage();
	
	}



}


