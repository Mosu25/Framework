package com.mosu.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePage extends BaseTest{

	@Test
	public void searchFlipkart() {
		driver.findElement(By.name("q")).sendKeys("Flipkart",Keys.ENTER);
	}

}
