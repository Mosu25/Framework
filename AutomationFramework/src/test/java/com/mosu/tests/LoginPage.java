package com.mosu.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest{

	@Test
	public void searchAmazon() {
		driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);
	}
}
