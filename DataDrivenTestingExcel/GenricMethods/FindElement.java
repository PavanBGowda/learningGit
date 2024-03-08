package GenricMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.css.sac.Locator;

import Utlities.BrowserFactory;

public class FindElement extends BrowserFactory {

	public static WebElement getElementByCss(String element ) {

		return driver.findElement(By.cssSelector(element));

	}

	public static WebElement getElementByXpath(String element) {

		return driver.findElement(By.xpath(element));

	}

	public static WebElement getElementByName(String element) {

		return driver.findElement(By.name(element));

	}

	public static WebElement getElementById(String element) {

		return driver.findElement(By.id(element));

	}

	public static WebElement getElementByclass(String element) {

		return driver.findElement(By.className(element));

	}

	
}
