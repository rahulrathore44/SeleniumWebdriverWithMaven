package com.webdriver.testcase.script.upload;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.webdriver.helper.ButtonHelper;
import com.webdriver.helper.DataProviderClass;
import com.webdriver.helper.LinkHelper;
import com.webdriver.helper.StartWebDriver;
import com.webdriver.helper.TextBoxHelper;
import com.webdriver.helper.WindowHelper;
import com.webdriver.testcase.TestAdminConsole;

public class TestMultipleUpload extends StartWebDriver {
	
	@Test
	public void OpenPage() {
		WindowHelper.navigateToPage(file.getUrl());
		LinkHelper.clickLink("File a Bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login", file.getUsername());
		TextBoxHelper.typeInTextBox("Bugzilla_password", file.getPassword());
		ButtonHelper.clickButton("log_in");
		LinkHelper.clickLink("Testng");
		ButtonHelper.clickButton("//input[@value='Add an attachment']");
	}
	
	@Test(dataProvider="getUploadFileList",dataProviderClass=DataProviderClass.class,dependsOnMethods="OpenPage")
	public void uploadFile(String name) throws InterruptedException, IOException {
		
		String path = TestAdminConsole.class.getClassLoader().getResource("resource/").getPath();
		path = path.replaceAll("bin", "src");
		Process p = Runtime.getRuntime().exec(path + "FileUpload.exe " + name);
		ButtonHelper.clickButton("data");
		Thread.sleep(1000);
		p.waitFor();
		
	}
	
	@AfterClass
	public static void logOut(){
		ButtonHelper.clickLogout();
	}

}
