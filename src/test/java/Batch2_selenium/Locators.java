package Batch2_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Locators {
	WebDriver driver;
  
	@Test (enabled = false) 
  public void byID() {
	  WebElement usernameElement = driver.findElement(By.id("email"));
	  usernameElement.sendKeys("Srikant");
	  
	  //driver.findElement(By.id("email")).sendKeys("Srikant");
  }
  
  @Test (enabled = false)
  public void byName() {
	  WebElement usernameElement = driver.findElement(By.name("password"));
	  usernameElement.sendKeys("SriPassword");
	  
	  //driver.findElement(By.name("email")).sendKeys("Srikant");
  }
  
  @Test (enabled = false)
  public void byLinkText() throws InterruptedException {

	  driver.findElement(By.linkText("REGISTER")).click();
	  Thread.sleep(4000);
  }
  
  @Test (enabled = false)
  public void byPartialLinkText() throws InterruptedException {

	  driver.findElement(By.partialLinkText("PORT")).click();
	  Thread.sleep(4000);
  }
  
  @Test (enabled = true)
  public void byCSSSelectorid() throws InterruptedException {

	  driver.findElement(By.cssSelector("input#email")).sendKeys("Srikant");
	  Thread.sleep(4000);
  }
  
  @Test (enabled = false)
  public void byCSSSelectorclass() throws InterruptedException {

	  driver.findElement(By.cssSelector("input.form-control")).sendKeys("Srikant");
	  Thread.sleep(4000);
  }
  
  @Test (enabled = false)
  public void byCSSSelectortagAttribute() throws InterruptedException {

	  driver.findElement(By.cssSelector("input[name=my-text]")).sendKeys("Srikant");
	  Thread.sleep(4000);
  }
  
  @Test (enabled = false)
  public void byCSSSelectortagclassAttribute() throws InterruptedException {

	  driver.findElement(By.cssSelector("input.form-control[type=password]")).sendKeys("Srikant124512121245");
	  Thread.sleep(4000);
  }

  @Test (enabled = true)
  public void byXpath() throws InterruptedException {

	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Srikant124512121245");
	  Thread.sleep(4000);
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException { 
	   Thread.sleep(1000);
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
//	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	//  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
