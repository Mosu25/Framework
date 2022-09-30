package com.mosu.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static void initDriver() {

		if(Objects.isNull(driver)) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}

	}

	public static void quitDriver() {

		if(Objects.nonNull(driver)) {
			driver.quit();
			driver=null;
		}
	}

}

