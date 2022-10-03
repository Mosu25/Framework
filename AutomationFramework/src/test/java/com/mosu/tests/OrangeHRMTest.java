package com.mosu.tests;

import java.time.Duration;

import org.testng.annotations.Test;

import com.mosu.driver.DriverManager;
import com.mosu.pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTest {


	private OrangeHRMTest() {

	}

	@Test
	public void LoginLogoutTest() throws InterruptedException {

		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		ohlp.enterUserName("Admin");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ohlp.enterPassword("admin123");	
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ohlp.clickLogin();
	}

}


