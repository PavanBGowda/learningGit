package TestData;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import DataDrivenTesting.DataTest;
import Utlities.BrowserFactory;


public class PassData extends BrowserFactory {
	
	
	@Test(priority = 1, dataProvider = "getDataTest", dataProviderClass = DataTest.class)
	public void testLoginPage(String UN, String PWD) throws InterruptedException {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//input[@ id = 'username']")).sendKeys(UN);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@ id = 'password']")).sendKeys(PWD);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
	} 
	
/**	@Test(priority = 1, dataProvider = "getDataTest", dataProviderClass = DataTest.class)
	public void assetLoginPage(String UN, String PWD) throws InterruptedException {
		
		
		WebElement login_button = driver.findElement(By.cssSelector("span[ id = 'loginbtn']"));
		login_button.click();
		Thread.sleep(3000);
		
		WebElement user_id = driver.findElement(By.cssSelector("input[ id = 'identifierId']"));
		user_id.sendKeys(UN);
		Thread.sleep(3000);
		
		WebElement user_id_next_button = driver.findElement(By.xpath("//span[ . = 'Next']"));
		user_id_next_button.click();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.cssSelector("input[ name = 'Passwd']"));
		password.sendKeys(PWD);
		
		WebElement password_next_button = driver.findElement(By.xpath("//span[ . = 'Next']"));
		password_next_button.click();
		Thread.sleep(10000);
		
		WebElement logout = driver.findElement(By.xpath ("//span[. ='Logout']"));
		logout.click();
		
		WebElement confirm_logout = driver.findElement(By.xpath("//button[. ='YES']"));
		confirm_logout.click();
		
	} */
	
	
}


	