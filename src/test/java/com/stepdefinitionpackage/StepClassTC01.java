package com.stepdefinitionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClassTC01 { 
	static WebDriver driver;

@Given("user should be in facebook login page")
public void user_should_be_in_facebook_login_page() throws InterruptedException {
   WebDriverManager.chromedriver().setup();
   ChromeOptions ops=new ChromeOptions();
   ops.addArguments("--remote-allow-origins=*");
   driver=new ChromeDriver(ops);
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
  //  throw new cucumber.api.PendingException();
}

@When("user should enter the username and password")
public void user_should_enter_the_username_and_password() {
   driver.findElement(By.id("email")).sendKeys("greens");
   driver.findElement(By.id("pass")).sendKeys("prem@1995");
   // throw new cucumber.api.PendingException();
}

@When("user should click the login button")
public void user_should_click_the_login_button() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	//driver.findElement(By.xpath("//*[@id=\"u_0_5_0J\"]")).click();
   // throw new cucumber.api.PendingException();
}

@Then("user should berifly login succesful")
public void user_should_berifly_login_succesful() throws InterruptedException {
 // driver.findElement(By.id("u_0_5_0J")).click();
	Thread.sleep(3000);
	//WebElement data = driver.findElement(By.id("u_0_0_kT"));
	WebElement data = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[1]"));
   String string = data.getText();
   System.out.println(string);
   
//	throw new cucumber.api.PendingException();
}

}
