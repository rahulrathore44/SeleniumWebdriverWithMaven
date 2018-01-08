package com.webdriver.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webdriver.helper.ButtonHelper;

public class PageBase {
	
	@FindBy(how=How.LINK_TEXT,linkText="Home")
	private WebElement Home;
	
	
	public PageBase(WebDriver _driver){
		PageFactory.initElements(_driver, this);
	}
	
	protected void LogOut(){
		ButtonHelper.clickLogout();	
	}
	
	protected void NavigateToHome(){
		Home.click();
	}

}
