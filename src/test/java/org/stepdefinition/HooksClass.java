package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.util.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@Before(order=1)
	public void beforeScenario() {
    System.out.println("before scenario got executed");
    launchChrome();
	loadUrl("https://www.snugglebugz.ca/");
	winMax();
	driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
    
	}
	@Before(order=2)
	public void startTime() {
    System.out.println("start time");
	}
	
	@After(order=5)
	public void afterScenario(Scenario s) throws IOException {
    System.out.println("After scenario got executed");
    String name = s.getName();
    String scenarioName = name.replace(" ", "_");
    screenshot(scenarioName);
    closeChrome();
	}
	@After (order=2)
	public void endTime() {
    System.out.println("end time");
	}

}
