package com.webdriver.testcase.testone;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.TextBoxHelper;

public class TestQuestionOne extends StartWebDriver {
	
	@Test
	public void testQuestion() throws InterruptedException{
		ButtonHelper.clickButton("//span[text()='One way']");
		TextBoxHelper.typeInTextBox("reservationFlightSearchForm.originAirport", "LAS");
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Las Vegas (LAS), Nevada, USA']")))
		.click();
		
		TextBoxHelper.typeInTextBox("reservationFlightSearchForm.destinationAirport", "VRN");
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Verona (VRN), Italy']")))
		.click();
		
		TextBoxHelper.clear("aa-leavingOn");
		TextBoxHelper.typeInTextBox("aa-leavingOn", "28/02/2017");
		ButtonHelper.clickButton("bookingModule-submit");
		
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Choose flights']")));
	}
}
