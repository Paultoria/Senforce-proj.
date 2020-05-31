package testing_senforce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class senforce_services {

	WebDriver driver;

	@BeforeTest
	public void  setup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\Paul\\Senforce-proj\\PaulQAE\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.senforceinsurance.com/");

	}

	@Test
	public void Senforce_Serevices() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[3]/div")).click();
		JavascriptExecutor Sd = (JavascriptExecutor) driver;
		Sd.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(9000);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("Senforce services test is succussfully completed");

	}
}
