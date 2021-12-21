package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.util.BaseClass;
import org.util.SBLoginPojo;

import io.cucumber.java.en.*;


public class SnuggleBugzLogin extends BaseClass {


	@Given("You should launch the browser and load SnuggleBugz Page")
	public void you_should_launch_the_browser_and_load_SnuggleBugz_Page() {

}

	@When("Move the cursor into page header and click")
	public void move_the_cursor_into_page_header_and_click() throws InterruptedException {
	WebElement header = driver.findElement(By.xpath("//div[@class='page-header__messages-bar-icon page-header__messages-bar-icon--account']"));
	moveElementTo(header);
	btnClick(header);
	Thread.sleep(2000);
	
}

	@When("Move the cursor into my account click")
	public void move_the_cursor_into_my_account_click()  {
	WebElement account = driver.findElement(By.xpath("//a[text()='My Account']"));
	moveElementTo(account);
	btnClick(account);
	
}

	@When("User should type username in the SnuggleBugz")
	public void user_should_type_username_in_the_SnuggleBugz() throws IOException, InterruptedException {
	SBLoginPojo s=new SBLoginPojo();
	fill(s.getTxtUser(), getData(1, 0));
	Thread.sleep(2000);
}

	@When("user should type password in the SnuggleBugz")
	public void user_should_type_password_in_the_SnuggleBugz() throws IOException {
	SBLoginPojo s=new SBLoginPojo();
	fill(s.getTxtPass(), getData(1, 1));
}

	@When("User should click login button")
	public void user_should_click_login_button() {
	SBLoginPojo s=new SBLoginPojo();
	btnClick(s.getBtnLogin());
}

	@When("I need to print the title of my page")
	public void i_need_to_print_the_title_of_my_page() {
     printTitle();
}

	@Then("User should naviagte to incorrect credential page")
	public void user_should_naviagte_to_incorrect_credential_page() {
    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue("verify the value", currentUrl.contains("snuggle"));
    System.out.println("My scenario 1 is passed");
}

	@When("User should type the valid username {string} in the snuggle page")
	public void user_should_type_the_valid_username_in_the_snuggle_page(String string) {
		SBLoginPojo s=new SBLoginPojo();
		fill(s.getTxtUser(), string);
    
}

	@When("I need to print the current url of page")
	public void i_need_to_print_the_current_url_of_page() {
    printTitle();
}

	@When("user should type the invalid password in the snuggle page {string}")
	public void user_should_type_the_invalid_password_in_the_snuggle_page(String string) {
		SBLoginPojo s=new SBLoginPojo();
		fill(s.getTxtPass(), string);
}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	SBLoginPojo s=new SBLoginPojo();
	btnClick(s.getBtnLogin());
   
}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		 String currentUrl = driver.getCurrentUrl();
		    Assert.assertTrue("verify the value", currentUrl.contains("snuggle"));
		    System.out.println("My scenario 2 is passed");
    
}

	
	

	

}
