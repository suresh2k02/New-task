package com.workspace;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login {

	public WebDriver driver;
	public Actions action;


	@Test
	public void login() throws Exception  {
		
		action = new Actions(driver);
	//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//Enter the user id
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("leeminho@gmail.com");

		//Enter the password 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Leemin@123");
		//Thread.sleep(3000);

		//click on login button
		driver.findElement(By.xpath("//button[normalize-space()='Login Now']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Dashboard')]")));
		
		//ele2.click();

		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);

//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Dashboard')]")));

		
		//page redirect to home and click on Dashboard
		driver.findElement(By.linkText("Dashboard")).click();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Thread.sleep(9000);

		//click on user profile icon
		driver.findElement(By.xpath("//a[@class='profile-btn ng-star-inserted']//img"));

		//Thread.sleep(1000);

		  
		WebElement ele = driver.findElement(By.xpath("//a[@class='profile-btn ng-star-inserted']//img"));

		//Action command
		action.moveToElement(ele).build().perform();
		//Thread.sleep(9000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		driver.findElement(By.cssSelector("li[class='list-group-item list-group-item-action d-flex align-items-center']")).click();
		//Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		try{
		    System.out.println("Waiting for Alert");
		    //WebDriverWait wait = new WebDriverWait(driver,10);
		   // wait.until(ExpectedConditions.alertIsPresent()).accept();
		   driver.switchTo().alert().accept();
		    System.out.println("Alert Displayed");
		}
		catch (Exception e){
		    System.out.println("Alert not Displayed");
		}
				
		

	}

	@BeforeTest
	public void openurl() throws Exception {

	//	WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();

		
		
		  //driver = new FirefoxDriver();
		  driver = new ChromeDriver();

		  driver.get("https://dev.practina.com/partner/login");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		
	}

	@AfterTest
	public void afterTest() {
		

	}

}

