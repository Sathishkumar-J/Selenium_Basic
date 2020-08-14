package Seleninum_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work_With_Edit_Example 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//1.Enter your email address
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("jsathish192@gmail.com");
		
		//2.Append a text and press keyboard tab
		WebElement appendbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendbox.sendKeys("jsathish192@gmail.com");
		
		//3.Get default text entered
		WebElement gettext = driver.findElement(By.name("username"));
		String text = gettext.getAttribute("value");
		System.out.println(text);
		
		//4.Clear the text
		WebElement cleartext = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
		cleartext.clear();
		
		//5.Confirm that edit field is disabled
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		Boolean disabled = disabledbox.isEnabled();
		System.out.println(disabled);

	}

}
