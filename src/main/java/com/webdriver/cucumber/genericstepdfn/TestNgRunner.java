/**
 * 
 */
package com.webdriver.cucumber.genericstepdfn;

import org.testng.annotations.Test;

import com.webdriver.cucumber.stepdefination.TestNgStpDfn;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * @author - rahul.rathore
 * @date - 05-May-2015
 * @project - Webdriver
 * @package - cucumber.genericstepdfn
 * @file name - TestNgRunner.java
 */
@CucumberOptions(features="classpath:cucumber/featurefile/",
glue="cucumber.stepdefination.TestNgStpDfn"
		)
public class TestNgRunner extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner runner;
	
	@Test
	public void runCakes(){
		runner = new TestNGCucumberRunner(TestNgStpDfn.class);
		runner.runCukes();
	}

}
