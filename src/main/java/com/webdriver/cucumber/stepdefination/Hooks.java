/**
 * 
 */
package com.webdriver.cucumber.stepdefination;

import org.openqa.selenium.By;

import com.webdriver.cucumber.settings.TestSettings;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * @author - rahul.rathore
 * @date - 03-May-2015
 * @project - Webdriver
 * @package - cucumber.stepdefination
 * @file name - Hooks.java
 */
public class Hooks {
	
	//private WebDriver driver;
	
	
	@When("^I click on \"(.*?)\" link$")
	public void i_click_on_link(String link) throws Throwable {
		TestSettings.driver.findElement(By.linkText(link)).click();
	}

	@Then("^the title should be \"(.*?)\"$")
	public void the_title_should_be(String title) throws Throwable {
	    Assert.assertEquals(title, TestSettings.driver.getTitle());
	}

	@And("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    //driver.quit();
	}
	
	

}
