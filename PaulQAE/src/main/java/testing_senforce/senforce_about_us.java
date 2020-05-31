package testing_senforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class senforce_about_us {

	WebDriver driver;

	@BeforeTest
	public void SP () {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\PaulQAE\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.senforceinsurance.com");

	}

	@Test
	public void SenforceAboutUs() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/ul/li/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/ul/li/ul/li[6]/a"));
		JavascriptExecutor Sd = (JavascriptExecutor) driver;
		Sd.executeScript("window.scrollBy(0,250)", "");

		
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("Management Team successfully displayed");
	}
}
