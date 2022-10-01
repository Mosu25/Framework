package com.mosu.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.mosu.driver.DriverManager;

public final class HomePage extends BaseTest{

	private HomePage(){
		
	}
	
	@Test
	public void searchFlipkart() {
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Flipkart",Keys.ENTER);
	}

}
