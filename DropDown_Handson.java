package Seleninum_Handson;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Handson {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//1.using index
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);

		//2.using value
		select.selectByValue("2");

		//3.usingtext
		select.selectByVisibleText("Appium");

		//4.
		java.util.List<WebElement> listofoption = select.getOptions();
		int option = listofoption.size();
		System.out.println(option);

		//5.
		dropdown.sendKeys("Seleninum");

		//4. select your programs
		WebElement multiSelect = driver.findElement
				(By.xpath("//*[@id='contentblock']/section/div[6]/select"));

		Select multiselectbox = new Select(multiSelect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);

	}

}
