package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	static WebDriver driver;

@Given("user should be enterd web page")
public void user_should_be_enterd_web_page() {
	  WebDriverManager.chromedriver().setup();
	   ChromeOptions ops=new ChromeOptions();
	   ops.addArguments("--remote-allow-origins=*");
	   driver=new ChromeDriver(ops);
	   driver.get("");
	   driver.manage().window().maximize();
	   
}

@When("user should select search box")
public void user_should_select_search_box() {
}

@When("user should enterd required product name")
public void user_should_enterd_required_product_name() {
    
}

}
