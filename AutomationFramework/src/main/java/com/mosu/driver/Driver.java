package com.mosu.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {
	
	private Driver(){
		
	}
	
	public static void initDriver() {

		if(Objects.isNull(DriverManager.getDriver())) {
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			DriverManager.getDriver().get("https://www.google.com");
//			driver.manage().window().maximize();
		}

	}

	public static void quitDriver() {

		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}

