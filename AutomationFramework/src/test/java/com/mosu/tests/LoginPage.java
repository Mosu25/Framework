package com.mosu.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.mosu.driver.Driver;

public final class LoginPage extends BaseTest{

	private LoginPage(){
		
	}
	
	@Test
	public void searchAmazon() {
		Driver.driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
	}
}
