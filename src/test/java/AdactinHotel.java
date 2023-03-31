import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	static WebDriver driver;
	
@BeforeClass
	public static void test01() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ops=new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(ops);
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
		

	}
@AfterClass
  public static void test02() throws InterruptedException {
	
	Thread.sleep(3000);
	//driver.close();

	
}
@Before
public void test03() {
 long Start = System.currentTimeMillis();
 System.out.println("StartTime:"+Start);

}
@After
public void test04() {
	long end = System.currentTimeMillis();
	System.out.println("EndTime:"+end);

}
@Test()
public void test05() throws InterruptedException {
	WebElement txtid = driver.findElement(By.id("username"));
	txtid.sendKeys("Prem2019");
	WebElement txt2 = driver.findElement(By.id("password"));
	txt2.sendKeys("prem@1995");
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		//btn.click();
WebElement dDn = driver.findElement(By.id("location"));

  Select select= new Select(dDn);
  select.selectByIndex(3);
  
 WebElement dDn1 = driver.findElement(By.id("hotels"));
  Select select1= new Select(dDn1);
 select1.selectByIndex(3);
  WebElement dDn2 = driver.findElement(By.id("room_type"));
  Select select2= new Select(dDn2);
  select2.selectByIndex(2);
   WebElement dDn3 = driver.findElement(By.id("adult_room"));
  Select select3= new Select(dDn3);
  select3.selectByIndex(1);
  WebElement dDn4 = driver.findElement(By.id("child_room"));
  Select select4= new Select(dDn4);
   select4.selectByIndex(0);
   WebElement btn2 = driver.findElement(By.id("Submit"));
  btn2.click();
  
  driver.findElement(By.id("radiobutton_0")).click();
  driver.findElement(By.id("continue")).click();
  
  driver.findElement(By.id("first_name")).sendKeys("PREM");
  driver.findElement(By.id("last_name")).sendKeys("KUMAR");
  driver.findElement(By.id("address")).sendKeys("ANATHUR,VILLUPURAM");
  driver.findElement(By.id("cc_num")).sendKeys("8438492221950079");
  WebElement dDn5 = driver.findElement(By.id("cc_type"));
  Select select5= new Select(dDn5);
  select5.selectByIndex(1);
WebElement dDn6 = driver.findElement(By.id("cc_exp_month"));
	Select select6=new Select(dDn6);
	select6.selectByIndex(3);

WebElement dDn7 = driver.findElement(By.id("cc_exp_year"));
	Select select7=new Select(dDn7);
	select7.selectByIndex(3);
driver.findElement(By.id("cc_cvv")).sendKeys("432");
WebElement order = driver.findElement(By.id("book_now"));
order.click();
Thread.sleep(5000);
WebElement order2 = driver.findElement(By.id("order_no"));
String attribute = order2.getAttribute("value");
System.out.println(attribute);


driver.findElement(By.id("my_itinerary")).click();
WebElement txt12 = driver.findElement(By.id("order_id_text"));
txt12.click();
txt12.sendKeys(attribute);
driver.findElement(By.id("search_hotel_id")).click();
driver.findElement(By.xpath("//form[@id='booked_form']//parent::td//following::tr[4]//following-sibling::tr//following-sibling::td[3]")).click();
Thread.sleep(5000);
String text2 = driver.switchTo().alert().getText();
driver.switchTo().alert().accept();;
//String text = a1.getText();
System.out.println(text2);
//a1.accept();
//driver.findElement(By.name("cancelall")).click();

}

}
