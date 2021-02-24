package com.qa.AllElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\AllElements\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Demo Site')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollTo(0,1500)");
		driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("Balakrishna");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("balasivarathri@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("H.NO:3-60/A");
		js.executeScript("window.scrollTo(0,500)");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		
		
	}

}
