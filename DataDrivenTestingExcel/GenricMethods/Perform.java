package GenricMethods;

import org.openqa.selenium.WebElement;

public class Perform{
	
	
	public static void clickOn(WebElement element) {
		element.click();
	}
	
	public static void passData(WebElement element, String data) {
		element.sendKeys(data);;
	}
}