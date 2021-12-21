package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.util.BaseClass;

import io.cucumber.java.en.*;

public class SnuggleForgotPassword extends BaseClass {
	@Given("User should launch chrome browser and load url")
	public void user_should_launch_chrome_browser_and_load_url() {
		
	
	}

	@When("User should click the forgot passwod link")
	public void user_should_click_the_forgot_passwod_link() throws InterruptedException {
	    driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	    Thread.sleep(2000);
	}

	@When("User should type the invalid email address")
	public void user_should_type_the_invalid_email_address() {
		WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
		inputEmail.sendKeys("greens@gmail.com");
	   
	}

	@When("User should click the send button")
	public void user_should_click_the_send_button() {
		driver.findElement(By.xpath("//button[text()='Send']")).click();
	   
	}

	@Then("User should navigate to forgot password page")
	public void user_should_navigate_to_forgot_password_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the current url", currentUrl.contains("forgot"));
		System.out.println("forgot password scenario is passed");   
	}
	
	@When("User should type the invalid email Address")
	public void user_should_type_the_invalid_email_Address(io.cucumber.datatable.DataTable d) {
		WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
		List<Map<String, String>> mp = d.asMaps();
		fill(inputEmail, mp.get(1).get("marvin"));
		
	  
	}

	





}
