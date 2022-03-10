package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  private ChromeDriver driver;

@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","/Users/subodhmantha/Downloads/Selenium/chromedriver");
	    driver= new ChromeDriver();
		
		//type url
		driver.get("https://www.facebook.com");
		//type UN
		driver.findElement(By.id("email")).sendKeys("saashb@gmail.com");
		//type PSWD
		driver.findElement(By.id("pass")).sendKeys("47334");
		//Click on Login button
		driver.findElement(By.name("login")).click();

  }
}
