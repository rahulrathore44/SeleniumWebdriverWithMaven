package com.webdriver.helper;

import java.util.Properties;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.TestCase;

public class TestReadConfigProperty extends TestCase {
	
	private ReadConfiguration readConfig;
	private String returnValue;
	private Properties prop;

	@Test
	public void testGetUrlMethod(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallTheGetUrlMethod();
		theStringShouldbeReturned("url");
	}
	
	@Test
	public void testGetUrlMethodWithNullReturn(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallTheGetUrlMethodAndUrlIsNullInfile();
		theStringShouldbeReturned("");
	}
	
	@Test
	public void testGetBrowserMethodWithValidValue(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetBrowserMethodWithValueInFile();
		theStringShouldbeReturned("browser");
	}
	
	@Test
	public void testGetBrowserMethodWithNullValue(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetBrowserMethodWithNullValueInFile();
		theStringShouldbeReturned("");
	}
	
	@Test
	public void testGetUserNameWithValue(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetUserNameWithValueInFile();
		theStringShouldbeReturned("username");
	}
	
	@Test
	public void testGetUserNameWithNullValueInFile(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetUserNameWithNullValueInFile();
		theStringShouldbeReturned("");
	}
	
	@Test
	public void testGetPasswordWithValueInFile(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetPasswordWithValueInFile();
		theStringShouldbeReturned("password");
	}
	
	@Test
	public void testGetPasswordWithNullValueInFile(){
		givenIcreateTheObjetofReadConfigProeprty();
		whenIcallGetPasswordWithNullValueInFile();
		theStringShouldbeReturned("");
	}

	private void whenIcallGetPasswordWithNullValueInFile() {
		Mockito.when(prop.getProperty("Password")).thenReturn(null);
		returnValue = readConfig.getPassword();
	}

	private void whenIcallGetPasswordWithValueInFile() {
		Mockito.when(prop.getProperty("Password")).thenReturn("password");
		returnValue = readConfig.getPassword();	
	}

	private void whenIcallGetUserNameWithNullValueInFile() {
		Mockito.when(prop.getProperty("Username")).thenReturn(null);
		returnValue = readConfig.getUsername();
	}

	private void whenIcallGetUserNameWithValueInFile() {
		Mockito.when(prop.getProperty("Username")).thenReturn("username");
		returnValue = readConfig.getUsername();	
	}

	private void whenIcallGetBrowserMethodWithNullValueInFile() {
		Mockito.when(prop.getProperty("browser")).thenReturn(null);
		returnValue = readConfig.getBrowser();
	}

	private void whenIcallGetBrowserMethodWithValueInFile() {
		Mockito.when(prop.getProperty("browser")).thenReturn("browser");
		returnValue = readConfig.getBrowser();
	}

	private void whenIcallTheGetUrlMethodAndUrlIsNullInfile() {
		Mockito.when(prop.getProperty("url")).thenReturn(null);
		returnValue = readConfig.getUrl();		
	}

	private void theStringShouldbeReturned(String expectedValue) {
		assertEquals(expectedValue, returnValue);
	}

	private void whenIcallTheGetUrlMethod() {
		Mockito.when(prop.getProperty("url")).thenReturn("url");
		returnValue = readConfig.getUrl();
	}

	private void givenIcreateTheObjetofReadConfigProeprty() {
		prop = Mockito.mock(Properties.class);
		readConfig = new ReadConfigProperty(prop);
	}

}
