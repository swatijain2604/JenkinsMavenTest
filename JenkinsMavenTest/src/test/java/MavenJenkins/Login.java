package MavenJenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login {
	
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys("jain.swati2604@gmail.com");
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("051205");
	  
	  driver.findElement(By.id("loginbutton")).click();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  String Title = driver.getTitle();
	  Assert.assertEquals(Title, "Facebook");
	  
	  System.out.println(Title);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
