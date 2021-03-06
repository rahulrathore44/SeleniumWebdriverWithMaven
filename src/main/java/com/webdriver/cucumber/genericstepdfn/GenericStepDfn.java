/**
 * 
 */
package com.webdriver.cucumber.genericstepdfn;

import com.webdriver.cucumber.settings.TestSettings;

import cucumber.api.java.en.Given;

/**
 * @author - rahul.rathore
 * @date - 03-May-2015
 * @project - Webdriver
 * @package - cucumber.genericstepdfn
 * @file name - GenericStepDfn.java
 */
public class GenericStepDfn {
	//private WebDriver driver;

	@Given("^User is at Bugzila login page with \"(.*?)\"$")
	public void user_is_at_Bugzila_login_page_with(String url) throws Throwable {
		TestSettings.driver.get(url);
		System.out.println("Title : " + TestSettings.title);
	}

}
