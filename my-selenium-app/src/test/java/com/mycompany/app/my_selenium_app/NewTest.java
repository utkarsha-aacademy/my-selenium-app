package com.mycompany.app.my_selenium_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  public WebDriver driver;
	@Test
  public void f() {
	  System.out.println("Welcome to Selenium Maven Project");
  }
  @Test
  public void launchChrome() {
	  System.setProperty("webdriver.chrome.driver", "/TestNGDemo/Binary/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
  }
}
