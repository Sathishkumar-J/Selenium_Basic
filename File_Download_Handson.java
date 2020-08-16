package Seleninum_Handson;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download_Handson 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		//1.Download Excel
		WebElement downloadexcel = driver.findElement(By.linkText("Download Excel"));
		downloadexcel.click();
		//Java have file class, so create new object
		File filelocation = new File("C:\\Users\\user\\Downloads");
		File[] totalfile = filelocation.listFiles();
		//foreach concept usinh
		for (File file : totalfile) 
		{
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("The download file have download path location");
			}
		}
	}

}
