package org.testing;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.util.BaseClass;
import org.util.SBLoginPojo;





public class Sample extends BaseClass {
	@Test
	public void tc1() throws IOException, InterruptedException {
		launchChrome();
		loadUrl("https://www.snugglebugz.ca/");
		winMax();
		driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
		
		WebElement header = driver.findElement(By.xpath("//div[@class='page-header__messages-bar-icon page-header__messages-bar-icon--account']"));
		moveElementTo(header);
		btnClick(header);
		Thread.sleep(2000);
		
		WebElement account = driver.findElement(By.xpath("//a[text()='My Account']"));
		moveElementTo(account);
		btnClick(account);
		
		SBLoginPojo s=new SBLoginPojo();
		fill(s.getTxtUser(), getData(1, 0));
		fill(s.getTxtPass(), getData(2, 0));
		btnClick(s.getBtnLogin());
		
	}
	@Ignore
	@Test
	public void tc2() {
    System.out.println("test2");
	}
	@Test
	public void tc3() {
    Assert.assertTrue("verify the value", false);
    System.out.println("test3");
    
	}
	

}
