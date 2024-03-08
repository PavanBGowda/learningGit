package Utlities;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataFiles extends BrowserFactory {

	public static File files() {

	//	File testdata = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\testdata.xlsx");
		File asset_testdata = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\asset_testdata.xlsx");
		return asset_testdata;
	}
	
	public static String url() {
		
		String URL = "http://ec2-18-189-200-115.us-east-2.compute.amazonaws.com";
		return URL;
	}
}