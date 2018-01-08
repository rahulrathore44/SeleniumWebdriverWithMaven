package com.webdriver.testcase;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.CheckBoxHelper;
import com.webdriver.helper.ComboBoxHelper;
import com.webdriver.helper.GenericHelper;
import com.webdriver.helper.LinkHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.TextBoxHelper;
import com.webdriver.helper.WindowHelper;

/**
 * @author - rahul.rathore
 * @date - 16-Nov-2014
 * @project - Webdriver
 * @package - testcase
 * @file name - TestSelect.java
 */
public class TestSelect extends StartWebDriver {
	
	@Test
	public void testDropDown() {
		WindowHelper.navigateToPage(file.getUrl());
		LinkHelper.clickLink("File a Bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login", file.getUsername());
		TextBoxHelper.typeInTextBox("Bugzilla_password", file.getPassword());
		CheckBoxHelper.clickCheckBox("Bugzilla_restrictlogin");
		ButtonHelper.clickButton("log_in");
		Assert.assertTrue(driver.getTitle().contains("Enter"));
		//LinkHelper.clickLink("Administration");
		//ButtonHelper.clickButton("div#header ul.links li:nth-of-type(9)>a");
		LinkHelper.clickLink("Testng");
		Assert.assertTrue(driver.getTitle().contains("Enter Bug"));
		/*Select ser = new Select(driver.findElement(By.id("bug_severity")));
		ser.selectByIndex(1);
		ser.selectByValue("trivial");
		ser.selectByVisibleText("normal");
		*/
		ComboBoxHelper.select("bug_severity", 1);
		ComboBoxHelper.select("bug_severity", "trivial");
		ComboBoxHelper.select("rep_platform", "Macintosh");
		
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			GenericHelper.takeScreenShot(this.getClass().getName()); //"TestSelect"
			Assert.fail(e.toString());
		}
		ButtonHelper.clickLogout();
	
	}

}
