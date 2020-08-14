package Seleninum_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Handson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//1. Select the languages that you know?
		WebElement selectlanguage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		selectlanguage.click();
		
		//2.Confirm Selenium is checked
		WebElement seleninum = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div"));
		Boolean seleninumselect = seleninum.isSelected();
		System.out.println(seleninumselect);
		
		//3.DeSelect only checked
		WebElement firstelement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		
		if(firstelement.isSelected())
		{
			firstelement.click();
		}
		
		WebElement secondelement = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		
		if(secondelement.isSelected())
		{
			secondelement.click();
		}
	}

}
