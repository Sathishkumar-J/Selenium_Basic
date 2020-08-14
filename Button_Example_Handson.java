package Seleninum_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Example_Handson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		//2.Find position of button (x,y)
		WebElement findposition = driver.findElement(By.id("position"));
		Point position = findposition.getLocation();
		int x = position.getX();
		int y = position.getY();
		System.out.println("X value is = " +x+"Y value is =" +y);
	
		//3.Find button color
		WebElement findcolor =  driver.findElement(By.id("color"));
		String color = findcolor.getCssValue("background-color");
		System.out.println("The button color is ="+color);
		
		//4. Find the height and width
		WebElement findsize = driver.findElement(By.id("size"));
		int height = findsize.getSize().getHeight();
		int width  = findsize.getSize().getWidth();
		System.out.println("The height is :"+ height + "Width is :"+width);
		
		//1. Click button to travel home page
		WebElement clickbutton = driver.findElement(By.id("home"));
		clickbutton.click();
				
	}

}
