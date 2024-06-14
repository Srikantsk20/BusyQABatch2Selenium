package Batch2_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class XpathLocator {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  	driver.findElement(By.xpath("//input[@id='my-text-id']")).sendKeys("Srikant");
		driver.findElement(By.xpath("//input[contains(@name,'my-pass')]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//label[contains(text(),'Texta')]/textarea")).sendKeys("Xpath located By Srikant");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='my-text-id']")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'my-pass')]")).clear();
		driver.findElement(By.xpath("//label[contains(text(),'Texta')]/textarea")).clear();
  
		driver.findElement(By.xpath("//input[@type='text' and @name='my-text']")).sendKeys("Srikant_new");
		driver.findElement(By.xpath("//input[@name='my-password' or @type='password']")).sendKeys("Srikant_new");
		
		String elementtext = driver.findElement(By.xpath("//h1[contains(text(),'Automation')]")).getText();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
