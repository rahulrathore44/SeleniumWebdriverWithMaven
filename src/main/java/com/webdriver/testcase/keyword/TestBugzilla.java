/**
 * 
 */
package com.webdriver.testcase.keyword;

import org.testng.annotations.Test;

import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.WindowHelper;
import com.webdriver.keyword.KeywordSteps;

/**
 * @author - rahul.rathore
 * @date - 14-Jun-2015
 * @project - Webdriver
 * @package - testcase.keyword
 * @file name - TestBugzilla.java
 */
public class TestBugzilla extends StartWebDriver {
	
	@Test
	public void testCaseOne(){
		KeywordSteps.readExcelPerformAction("C:\\Users\\rahul.rathore\\Desktop\\Attachments_2015613\\Data.xlsx", "Bugzilla");
	}
	
	@Test()
	public void testCodingBat() {
		WindowHelper.navigateToPage("http://codingbat.com/");
		KeywordSteps.readExcelPerformAction("C:\\Users\\rahul.rathore\\Desktop\\Attachments_2015613\\Data.xlsx", "Codingbat");
		
	}

}
