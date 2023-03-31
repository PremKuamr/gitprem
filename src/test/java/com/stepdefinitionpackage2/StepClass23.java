package com.stepdefinitionpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass23 {
	static WebDriver driver;
	@Given("User should be in login page")
	public void user_should_be_in_login_page() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		   ChromeOptions ops=new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(ops);
		   driver.get("https://adactinhotelapp.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	   // throw new cucumber.api.PendingException();
	}

	@When("User should be entered the UserName  and password")
	public void user_should_be_entered_the_UserName_and_password() {
		long Start = System.currentTimeMillis();
		System.out.println("StartTime:"+Start);

		
		WebElement txtid = driver.findElement(By.id("username"));
		txtid.sendKeys("Prem2019");
		WebElement txt2 = driver.findElement(By.id("password"));
		txt2.sendKeys("prem@1995");
	
	  //  throw new cucumber.api.PendingException();
	}

	@When("user should be Click the login button")
	public void user_should_be_Click_the_login_button() {
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();	
  
	   // throw new cucumber.api.PendingException();
	}

	@Then("user should be verify the login page")
	public void user_should_be_verify_the_login_page() throws InterruptedException {
		Thread.sleep(3000);
		WebElement data2 = driver.findElement(By.id("username_show"));
		data2.getAttribute("value");
	   System.out.println(data2);
	   // throw new cucumber.api.PendingException();
	}

@Given("User should be select location,hotel,room type")
public void user_should_be_select_location_hotel_room_type() {
	WebElement dDn = driver.findElement(By.id("location"));

	  Select select= new Select(dDn);
	  select.selectByIndex(3);
	  
	 WebElement dDn1 = driver.findElement(By.id("hotels"));
	  Select select1= new Select(dDn1);
	 select1.selectByIndex(3);
	  WebElement dDn2 = driver.findElement(By.id("room_type"));
	  Select select2= new Select(dDn2);
	  select2.selectByIndex(2);
}

@When("user should be select number of rooms,check in date,check out date")
public void user_should_be_select_number_of_rooms_check_in_date_check_out_date() {
 
}

@When("User should be select adults per room,children per room")
public void user_should_be_select_adults_per_room_children_per_room() {
	  WebElement dDn3 = driver.findElement(By.id("adult_room"));
	  Select select3= new Select(dDn3);
	  select3.selectByIndex(1);
	  WebElement dDn4 = driver.findElement(By.id("child_room"));
	  Select select4= new Select(dDn4);
	   select4.selectByIndex(0);
}

@Then("user should select search button")
public void user_should_select_search_button() {
	 WebElement btn2 = driver.findElement(By.id("Submit"));
	  btn2.click();
}
@Given("user should be select the hotel")
public void user_should_be_select_the_hotel() {
	 driver.findElement(By.id("radiobutton_0")).click();
	 // driver.findElement(By.id("continue")).click();
	  
    
}

@When("user should be select continue button")
public void user_should_be_select_continue_button() {
	 driver.findElement(By.id("continue")).click();
	  
   }
@Given("User should be select first name,User should be select last name")
public void user_should_be_select_first_name_User_should_be_select_last_name() {
	 driver.findElement(By.id("first_name")).sendKeys("PREM");
	  driver.findElement(By.id("last_name")).sendKeys("KUMAR");
}
@When("User should be select billing Address,user should be entered credit card number")
public void user_should_be_select_billing_Address_user_should_be_entered_credit_card_number() {
	 driver.findElement(By.id("address")).sendKeys("ANATHUR,VILLUPURAM");
	  driver.findElement(By.id("cc_num")).sendKeys("8438492221950079");

}

@When("user should be select expiry date, user should select book now option")
public void user_should_be_select_expiry_date_user_should_select_book_now_option() {
	  WebElement dDn5 = driver.findElement(By.id("cc_type"));
	  Select select5= new Select(dDn5);
	  select5.selectByIndex(1);
//	WebElement dDn6 = driver.findElement(By.id("cc_exp_month"));
//	Select select6=new Select(dDn6);

	
}

@Given("User should select My itinerary")
public void user_should_select_My_itinerary() {
	WebElement dDn6 = driver.findElement(By.id("cc_exp_month"));
	Select select6=new Select(dDn6);
	//Select select6=new Select(dDn6);
	select6.selectByIndex(3);
}

@Given("user should select search order id")
public void user_should_select_search_order_id() {WebElement dDn7 = driver.findElement(By.id("cc_exp_year"));
Select select7=new Select(dDn7);
select7.selectByIndex(3);
driver.findElement(By.id("cc_cvv")).sendKeys("432");
}

@When("user should select order Id")
public void user_should_select_order_Id() throws InterruptedException {
	WebElement order = driver.findElement(By.id("book_now"));
	order.click();
	Thread.sleep(5000);
}

@When("user should select cancel Id")
public void user_should_select_cancel_Id() {
	WebElement order2 = driver.findElement(By.id("order_no"));
	String attribute = order2.getAttribute("value");
	System.out.println(attribute);


	driver.findElement(By.id("my_itinerary")).click();
	WebElement txt12 = driver.findElement(By.id("order_id_text"));
	txt12.click();
	txt12.sendKeys(attribute);
	
}

@Then("user should select Alert box")
public void user_should_select_Alert_box() throws InterruptedException {
	driver.findElement(By.id("search_hotel_id")).click();
	driver.findElement(By.xpath("//form[@id='booked_form']//parent::td//following::tr[4]//following-sibling::tr//following-sibling::td[3]")).click();
	Thread.sleep(5000);
	String text2 = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();;
	//String text = a1.getText();
	System.out.println(text2);
	//a1.accept();
	//driver.findElement(By.name("cancelall")).click();
	Thread.sleep(5000);
	long end = System.currentTimeMillis();
	System.out.println("EndTime:"+end);
  
}


	  
   
}




