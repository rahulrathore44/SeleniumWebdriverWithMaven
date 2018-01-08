package com.webdriver.testcase.testone;

import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.WindowHelper;

public class TestClickButton extends StartWebDriver {
	@Test
	public void testButtonClick() throws InterruptedException {
		WindowHelper.navigateToPage("https://jhu.test.technolutions.net/account/login");
		ButtonHelper.clickButton(".//button[text()='Login']");
		Thread.sleep(5000);
	}
}
