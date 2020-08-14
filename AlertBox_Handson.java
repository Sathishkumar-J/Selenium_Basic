package Seleninum_Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox_Handson 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//1. Click the button to display a alert box.
		WebElement displayalert = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		displayalert.click();
		// Seleninum have interface (Alert) is a very important 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
		
		//2. Click the button to display a confirm box.
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmbox.click();
		//Alert interface using
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(4000);
		confirmalert.dismiss();
		
		//3. Click the button to display a prompt box.
		WebElement promptbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptbox.click();
		//Alert interfce using
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Test");
		Thread.sleep(4000);
		promptalert.accept();
				
	}

}
