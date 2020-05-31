package testing_senforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class senforce_contact_us {

	WebDriver driver;

	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Paul\\Paul_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.senforceinsurance.com/");

	}

	@Test
	public void SenforceTest() 
	{

		//click contact
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[5]/div")).click();

		//code for scrolling
		JavascriptExecutor Sdown = (JavascriptExecutor) driver;
		Sdown.executeScript("window.scrollBy(0,250)", "");

		//input name
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Odeh Paul Ominyi");

		//input email
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("odehpaultoria4life@gmail.com");

		//Subject
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Automation Software Testing");

		//Message
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Testing Senforce Insurance Broker website in order to satisfy every customer");

		//Click submit botton
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='button']")).click();

		//click on search button
		driver.findElement(By.name("button")).click();
		System.out.println("Contact us successfully automated");
	} 

	@AfterTest
	public void teardown() {

		//close driver 
		driver.close();
		driver.quit();
		System.out.println("Contact successfully completed");
	}
}

