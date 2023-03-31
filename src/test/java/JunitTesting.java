
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTesting {
	static WebDriver driver;
	
	@BeforeClass
	
	public static void test01() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	@AfterClass
	public static void test02() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
	@Before
	public void test03() throws IOException {
TakesScreenshot screenshot=(TakesScreenshot)driver;
File source = screenshot.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\");
FileUtils.copyFile(source, dest);
long start = System.currentTimeMillis();
System.out.println("StartTime:"+start);

		
	}
	
	@After
	
	public void test04() throws IOException, InterruptedException {
		//TakesScreenshot screenshot=(TakesScreenshot)driver;
//		File source1 = screenshot.getScreenshotAs(OutputType.FILE);
//		Thread.sleep(3000);
//		File dest1=new File("C:\\New folder (2)");
//		Thread.sleep(3000);
//		FileUtils.copyFile(source1, dest1);
		long end = System.currentTimeMillis();
		System.out.println("EndTime:"+end);


	}
	@Test
	
	public void test05() {
		driver.findElement(By.id("email")).sendKeys("prem");
		driver.findElement(By.id("pass")).sendKeys("prem@123");
		driver.findElement(By.name("login")).click();

	}

}
