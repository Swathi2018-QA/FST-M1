package com.ibm.JobBoard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_4 {
	WebDriver driver;
	
	@BeforeMethod
	public void browserSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0027MT744\\Desktop\\FullStackTester\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();   
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void verifySecondHeaderTitle()
	{
		WebElement secondHeading = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
		String pageSecondHeader = secondHeading.getText();
		System.out.println("Second Header is: "+pageSecondHeader);
		if(pageSecondHeader.equals("Quia quis non"))
		{
			driver.close();
		}
		
	}

}
