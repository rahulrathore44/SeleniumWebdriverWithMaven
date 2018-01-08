package com.webdriver.testcase;

import org.testng.annotations.Test;

import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.WindowHelper;
import com.webdriver.pom.BugDetail;
import com.webdriver.pom.EnterBug;
import com.webdriver.pom.HomePage;
import com.webdriver.pom.LoginPage;

public class TestPageObjectModel extends StartWebDriver {
	
	@Test
	public void testCase() {
		WindowHelper.navigateToPage("http://localhost:5001/");
		HomePage hPage = new HomePage(driver);
		LoginPage lPage = hPage.ClickFileABug();
		EnterBug ePage = lPage.Login(file.getUsername(), file.getPassword());
		BugDetail bPage = ePage.ClickTestNg();
		bPage.SelectSeverity("critical");
	}

}
