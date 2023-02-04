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
  public void directToRegisterjsp() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-project-deployment/login.jsp");
	  WebElement link1 =  webDriver.findElement(By.className("signup-image-link"));
	  link1.click();
}


  @Test
	  public void checkLinkAgree() {
		  //Load website as a new page
		  webDriver.navigate().to("http://localhost:8090/devops-project-deployment/registration.jsp");
		  WebElement links =  webDriver.findElement(By.className("label-agree-term"));
		  links.click();
  }
  
  @Test
  public void checkLinkSignup() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-project-deployment/registration.jsp");
	  WebElement linksignup =  webDriver.findElement(By.id("signup"));
	  linksignup.click();
}
  @Test
  public void checkLinkDirectToLoginjsp() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-project-deployment/registration.jsp");
	  WebElement link =  webDriver.findElement(By.className("signup-image-link"));
	  link.click();
  }
  @Test
  public void checkTitle() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/devops-project-deployment/registration.jsp");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Register");
	  
System.out.println("title: "+webDriver.getTitle());
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