/**
 * 
 */
package com.webdriver.testcase.testone;

import java.util.Map;

import org.testng.annotations.Test;

import com.webdriver.annotation.XlsxFilePath;
import com.webdriver.helper.DataProviderClass;

/**
 * @author - rahul.rathore
 * @date - 27-Sep-2015
 * @project - Webdriver
 * @package - testcase.testOne
 * @file name - TestCustomeAnnotation.java
 */
public class TestCustomeAnnotation {
	
	@Test(dataProvider="getData",dataProviderClass=DataProviderClass.class)
	@XlsxFilePath(filePath = "Login.xlsx", sheetName = "LoginDetails")
	public void TestCaseLogin(Map<String, String> data){
		
	}
	
	@Test(dataProvider="getData",dataProviderClass=DataProviderClass.class)
	@XlsxFilePath(filePath = "Login_one.xlsx", sheetName = "LoginDetails")
	public void TestCaseLogin_one(Map<String, String> data){
		
	}

}
