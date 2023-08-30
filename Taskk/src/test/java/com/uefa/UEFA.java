package com.uefa;





import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UEFA {
	public WebDriver driver;

	

	@Test
	public void UEFA() throws Exception  {
		
	//	driver.findElement(By.id("onetrust-accept-btn-handler")).click();


		driver.get("https://gaming.uefa.com/");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector(".si-btn.si-btn-transparent")).click();
		
		driver.findElement(By.cssSelector(".si-btn__wrap.si-web-flex")).click();
		
		driver.findElement(By.cssSelector(".si-btn.si-btn--secondary.si-web-flex")).click();
		
		driver.findElement(By.cssSelector(".si-btn.si-btn--primary")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		driver.findElement(By.cssSelector("button[class='C1wbK'] span")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("#gigya-textbox-75074230944436030")).sendKeys("viratsss@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@id='gigya-password-59919533498235100']")).sendKeys("Aa133@1233");
		
		driver.findElement(By.cssSelector("#gigya-textbox-130722358975432270")).sendKeys("virat");
		
		

		
		driver.findElement(By.cssSelector("#gigya-textbox-30497114450394400")).sendKeys("lastname");
		
		driver.findElement(By.cssSelector("#gigya-textbox-88315185881230510")).sendKeys("02");
		driver.findElement(By.cssSelector("#gigya-textbox-105406014904922500")).sendKeys("02");
		driver.findElement(By.cssSelector("#gigya-textbox-32538633360993784")).sendKeys("2002");
		
	//	driver.findElement(By.cssSelector("#gigya-checkbox-terms")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Create account']")).click();
		
		
	}
	@Test(priority=1)
	public void login() throws Exception {
		

		driver.get("https://gaming.uefa.com/en/uefachampionsleague");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='C1wbK TYHqc']")).click();
		
		Thread.sleep(5000);

		
		driver.findElement(By.cssSelector("#gigya-loginID-75579930407612940")).sendKeys("user123@gmail.com");
		
		driver.findElement(By.cssSelector("#gigya-password-32665041627364124")).sendKeys("1236445");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
	
	}
	
	
	
	@BeforeTest
	public void openurl() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		
		  driver = new FirefoxDriver();
		 // driver = new ChromeDriver();

		  driver.get("https://gaming.uefa.com/");
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();

		  
		
	}

	@AfterTest
	public void afterTest() {
		
		//driver.quit();
		

	}

}
