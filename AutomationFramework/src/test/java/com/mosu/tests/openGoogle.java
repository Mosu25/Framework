package com.mosu.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class openGoogle {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void searchAmazon() {

		driver.findElement(By.name("q")).sendKeys("Amazon",Keys.ENTER);

	}

	public void searchFlipkart() {

		driver.findElement(By.name("q")).sendKeys("Flipkart",Keys.ENTER);
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
