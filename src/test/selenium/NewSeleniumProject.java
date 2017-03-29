package test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewSeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Development\\selenium-java-3.3.1\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      //Puts a Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("https://my.apa.org");
	      driver.manage().window().maximize();
	      
	      //Click on check Box
	      driver.findElement(By.id("username")).clear();
	      driver.findElement(By.id("username")).sendKeys("member-test");
	      //Thread.sleep(5000);
	      driver.findElement(By.id("password")).clear();
	      driver.findElement(By.id("password")).sendKeys("coffee4me");
	      //Thread.sleep(5000);
	      driver.findElement(By.id("loginBtnccc")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("Edit Profile")).click();
	      
	      //System.out.println("Total number of jobs is " + driver.findElement(By.id("searchCount")).getText());
	      driver.close();

	}

}
