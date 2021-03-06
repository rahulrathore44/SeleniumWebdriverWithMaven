package com.webdriver.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webdriver.helper.AlertHelper;
import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.WindowHelper;

/**
 * @author - rahul.rathore
 * @date - 16-Nov-2014
 * @project - Webdriver
 * @package - testcase
 * @file name - TestPrompt.java
 */
public class TestPrompt extends StartWebDriver {
	
	@Test
	public void testCasePrompt() {
		WindowHelper.navigateToPage("http://www.w3schools.com/js/js_popup.asp");
		ButtonHelper.clickButton("//div[@id='main']/div[8]/a");
		if(WindowHelper.isBrowserPopupPresent())
			WindowHelper.switchTo(1);
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		ButtonHelper.clickButton("//button[text()='Try it']");
		
		if(AlertHelper.isAlertPresent())
			AlertHelper.clickCancel();
		
		ButtonHelper.clickButton("//button[text()='Try it']");
		
		if(AlertHelper.isAlertPresent()){
			System.err.println("String : " + AlertHelper.getText());
			AlertHelper.sendKeys("Webdriver");
			AlertHelper.clickOk();
		}
		WindowHelper.switchToParentWithClose();
		
		
		
	}

}
