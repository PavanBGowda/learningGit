package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import DataDrivenTesting.DataTest;
import GenricMethods.FindElement;
import GenricMethods.Perform;
import Utlities.BrowserFactory;
import Utlities.DataFiles;

public class PassData1 extends BrowserFactory {
	

	@Test(priority = 1, dataProvider = "getDataTest", dataProviderClass = DataTest.class)
	public void asset(String UN, String PWD) throws InterruptedException {
		
		driver.get(DataFiles.url());
		
		WebElement login = FindElement.getElementByCss("span[ id = 'loginbtn']");
		Perform.clickOn(login);

		WebElement user_id = FindElement.getElementByCss("input[ id = 'identifierId']");
		
		if (user_id.isDisplayed()) {
			
			Perform.passData(user_id, UN);
			Thread.sleep(3000);
			
			WebElement user_id_nxt_btn = FindElement.getElementByXpath("//span[ . = 'Next']");
			Perform.clickOn(user_id_nxt_btn);
			Thread.sleep(3000);
			
			WebElement password = FindElement.getElementByCss("input[ name = 'Passwd']");
			Perform.passData(password, PWD);
			Thread.sleep(3000);
			
			WebElement password_nxt_btn = FindElement.getElementByXpath("//span[ . = 'Next']");
			Perform.clickOn(password_nxt_btn);
			
			WebElement logout = driver.findElement(By.xpath ("//span[. ='Logout']"));
			logout.click();
			
			Thread.sleep(3000);
			WebElement confirm_logout = driver.findElement(By.xpath("//button[. ='YES']"));
			confirm_logout.click();
			
			
		} else 
		{
			
			System.out.println("Already logined");
			
		}
		
		
		System.out.println("Inventory Dashboard page");
		
	}
}
