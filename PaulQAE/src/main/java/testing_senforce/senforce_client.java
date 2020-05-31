package testing_senforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class senforce_client {



	WebDriver driver;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\NewScript\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.senforceinsurance.com/");
	}

	@Test
	public void client() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li/a"));

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/ul/li/a"));

		System.out.println("Client test is ok");
	}

	@AfterTest
	public void tearDownmethod() {

		driver.close();
		driver.quit();
		System.out.println("Client successfully launch");

	}
}

