package com.webdriver.helper.stub;

import org.openqa.selenium.TimeoutException;

import com.webdriver.helper.ReadConfiguration;

public class ReadConfigPropertyStub implements ReadConfiguration {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "url";
	}

	@Override
	public String getBrowser() {
		// TODO Auto-generated method stub
		return "browser";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "username";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "password";
	}

	@Override
	public int getElementWait() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageWait() throws TimeoutException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDbName() {
		// TODO Auto-generated method stub
		return "name";
	}

	@Override
	public String getDbUserName() {
		// TODO Auto-generated method stub
		return "dbusername";
	}

	@Override
	public String getDbPassword() {
		// TODO Auto-generated method stub
		return "dbpassword";
	}

	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return "gethost";
	}

	@Override
	public boolean isGridPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getGridUrl() {
		// TODO Auto-generated method stub
		return "gridurl";
	}

}
