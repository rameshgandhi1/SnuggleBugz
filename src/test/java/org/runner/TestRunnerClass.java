package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.util.generateJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\",glue="org.stepdefinition",dryRun=false,
plugin= {"html:target\\reports",
		 "junit:target\\reports\\sbjunit.xml",
		 "json:target\\reports\\sbjson.json"})

public class TestRunnerClass extends generateJvmReport {
	
	@AfterClass
	public static void Sample() {
		reportJVM("C:\\Users\\Ramesh\\eclipse-workspace\\SnuggleBugz\\target\\reports\\sbjson.json");
		
		
    
	}
	
}
