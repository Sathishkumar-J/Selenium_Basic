package Seleninum_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//1.Are you enjoying the classes?
		WebElement click = driver.findElement(By.id("yes"));
		click.click();
		
		//2.Find default selected radio button
		WebElement unchecked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		WebElement checked   = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		
		Boolean status1 = unchecked.isSelected();
		Boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		//3.Select your age group (Only if choice wasn't selected)
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
	}

}
