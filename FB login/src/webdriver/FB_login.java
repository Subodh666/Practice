package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		//create reference for webdriver interface
				WebDriver driver;
				
				//open chrome browser
				System.setProperty("webdriver.chrome.driver","/Users/subodhmantha/Downloads/Selenium/chromedriver");
				driver = new ChromeDriver();
				
				//type url
				driver.get("https://www.facebook.com");
				//type UN
				driver.findElement(By.id("email")).sendKeys("hgfuyt7jb8yjhb@gmail.com");
				//type PSWD
				driver.findElement(By.id("pass")).sendKeys("asf23vsd");
				//Click on Login button
				driver.findElement(By.name("login")).click();

	}

}
