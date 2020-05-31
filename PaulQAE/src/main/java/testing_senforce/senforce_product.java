package testing_senforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class senforce_product {

	WebDriver driver;

	@BeforeTest
	public void SP() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\PaulQAE\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.senforceinsurance.com/");

	}

	@Test
	public void SenforcePackage() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]/div")).click();
		JavascriptExecutor Sd = (JavascriptExecutor) driver;
		Sd.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/a[11]/div/div[2]")).click();

	}


	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("package test is succussful with complete laptop insurance");

	}

}