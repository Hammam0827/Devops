package com.dvops.maven.eclipse;

import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
  @Test
  public void checkId() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-web-project-deployment/");
	  WebElement we =  webDriver.findElement(By.id("aboutMenu"));
	  
	  System.out.println("id we: "+we.getAttribute("role"));
	  Assert.assertEquals(we.getAttribute("role"), "aboutinfo");
  }
  @Test
  public void checkTitle() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-web-project-deployment/");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "To do list");
	  
System.out.println("title: "+webDriver.getTitle());
	  
//	  //Retrieve link using it's class name and click on it
//	  webDriver.findElement(By.className("container text-left")).click();
//
//	  Assert.assertTrue(webDriver.getTitle().contains("New to do list"));
//	  System.out.println("new title: "+webDriver.getTitle());
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();			
  }

}