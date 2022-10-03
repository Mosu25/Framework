package com.mosu.pages;

import org.openqa.selenium.By;

import com.mosu.driver.DriverManager;


public final class OrangeHRMLoginPage {
	
	
	private final By txtbox_username=By.name("username");
	private final By txtbox_password=By.xpath("input[@name='password'] and [@type='password']");
	private final By btnlogin = By.xpath("//button[text()=' Login ']");


	public void enterUserName(String userName) {

		DriverManager.getDriver().findElement(txtbox_username).sendKeys(userName);
	}

	public void enterPassword(String password) {

		DriverManager.getDriver().findElement(txtbox_password).sendKeys(password);	

	}

	public void clickLogin() {

		DriverManager.getDriver().findElement(btnlogin).click();
	}



}


