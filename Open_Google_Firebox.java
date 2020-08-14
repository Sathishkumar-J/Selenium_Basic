package Seleninum_Handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Google_Firebox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.google.co.in");
		//driver.quit();
	}

}
