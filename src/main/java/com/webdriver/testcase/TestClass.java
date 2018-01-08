package com.webdriver.testcase;

import java.util.Map;

import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.DataProviderClass;
import com.webdriver.helper.GenericHelper;
import com.webdriver.helper.LinkHelper;
import com.webdriver.helper.ReadExcelFile;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.TextBoxHelper;

/**
 * @author - rahul.rathore
 * @date - 16-Nov-2014
 * @project - Webdriver
 * @package - testcase
 * @file name - TestClass.java
 */
public class TestClass extends StartWebDriver{
	
	//private ArrayList<String> status = new ArrayList<String>();
	
	int rowIndex = 1;
		
	@Test(dataProvider="testValidLogin",dataProviderClass=DataProviderClass.class)
	public void testCase(Map<String, Object> data) throws Exception {
		System.out.println("Method Called");
		LinkHelper.clickLink("File a Bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login", data.get("UserName").toString());
		TextBoxHelper.typeInTextBox("Bugzilla_password", data.get("Password").toString());
		ButtonHelper.clickButton("log_in");
		
		if(GenericHelper.isElementPresent("error_msg"))
			ReadExcelFile.UpdateToExcel(3, rowIndex++, "TestLogin.xlsx", "LoginDetails", "Fail");
		else
			ReadExcelFile.UpdateToExcel(3, rowIndex++, "TestLogin.xlsx", "LoginDetails", "Pass");
		
		/*if(data.get("Valid").toString().equalsIgnoreCase("no")){
			Assert.assertTrue(GenericHelper.isElementPresent("error_msg"));
			status.add("Fail");
		}else 
			status.add("Pass");*/
			
		//ButtonHelper.clickButton("//div[@id='header']//ul[@class='links']/li[1]//a");
		home_link.click();
		ButtonHelper.clickLogout();
	}
	
	/*@AfterClass(alwaysRun=true)
	public void writeToExcel() {
		WindowHelper.refresh();
		System.out.println("=============== Logout Called ========== " + this.getClass().getName());
		ButtonHelper.clickLogout();
		
	}*/
	

}
