package com.webdriver.testcase;

import java.util.Map;

import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.CheckBoxHelper;
import com.webdriver.helper.DataProviderClass;
import com.webdriver.helper.GenericHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.TextBoxHelper;
import com.webdriver.helper.WindowHelper;

public class TestPromotion extends StartWebDriver{
	@Test(dataProvider="getLoginData", dataProviderClass=DataProviderClass.class)
	public void Testcase1(Map<String, Object> data) throws InterruptedException{
		/*System.out.println("UserName: " + data.get("UserName") + " Password : " + data.get("Password"));*/

		
		if(GenericHelper.isElementPresent("//a[text()='No thanks']")){
			ButtonHelper.clickButton("//a[text()='No thanks']");
		}

		TextBoxHelper.typeInTextBox("splashEmail", data.get("Email").toString());
		ButtonHelper.clickButton("splashEmailBtn");	
		if(GenericHelper.isElementPresent("errorClose")){ 
			WindowHelper.refresh();
			System.out.println("Inside the loop");
		} else		
		TextBoxHelper.typeInTextBox("fName", data.get("FirstName").toString());
		TextBoxHelper.typeInTextBox("lName", data.get("LastName").toString());
		TextBoxHelper.typeInTextBox("emailConfirm", data.get("Email").toString());
		TextBoxHelper.typeInTextBox("phone", data.get("Phone").toString());
		TextBoxHelper.typeInTextBox("jobTitle", data.get("Job title").toString());
		TextBoxHelper.typeInTextBox("collegeName", data.get("Collage Name").toString());

		CheckBoxHelper.clickCheckBox("opt2Us");

		ButtonHelper.clickButton("regSubmit");

		//		if(data.get("Valid").toString().equalsIgnoreCase("Yes")){
		//			Assert.assertTrue(GenericHelper.isElementPreset("visitSite"));
		//			status.add("Pass");
		//			Thread.sleep(2000);
		//			WindowsHelper.refresh();
		//		} else {
		//		status.add("Fail");			
		Thread.sleep(2000);
		WindowHelper.refresh();	
		
	}
}
