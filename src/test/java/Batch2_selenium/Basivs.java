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
public class Basivs {
 WebDriver driver;
  @Test
  public void loginFunction() {
	  WebElement userNameElement = driver.findElement(By.name("username"));
	  userNameElement.sendKeys("Admin");
	  
	  WebElement passwordElement = driver.findElement(By.name("password"));
	  passwordElement.sendKeys("admin123");
	  
//	  Sleep(2);
	  
	  driver.findElement(By.className("orangehrm-login-button")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
//	   Scanner sc = new Scanner(System.in);
//	   System.out.println("Enter the name of Browser");
//	   String browserName = sc.nextLine();
//	   
//	   if(browserName.equals("firefox")) {
//		   driver = new FirefoxDriver();
//	   }else if (browserName.equals("edge")){
//			driver = new EdgeDriver();
//	   } else {
//			driver = new ChromeDriver();
//	   }
//	   sc.close();
	   
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before class method");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is After class method");
  }

}
