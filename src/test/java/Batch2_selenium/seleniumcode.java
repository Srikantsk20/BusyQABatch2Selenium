package Batch2_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumcode {
	public static void main(String Args[]) throws InterruptedException {
	  WebDriver driver;
	  
	  driver = new ChromeDriver();
	  // driver.navigate().to("https://demo.automationtesting.in/Register.html");
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.navigate().to("https://demo.automationtesting.in/Windows.html");
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().forward();
	  Thread.sleep(3000);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//label[contains(text(),'Address')]/following-sibling::div/textarea")).sendKeys("This is Srikant before refresh");
//	  driver.navigate().back();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  
}
}
