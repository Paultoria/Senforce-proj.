package Testing.Paul;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\PaulQAE\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//go to facebook sign in page
		driver.get("https://www.facebook.com/");

		//To enter first name
		driver.findElement(By.name("firstname")).sendKeys("Paul");

		//To enter last name
		driver.findElement(By.name("lastname")).sendKeys("Odeh");

		//To enter phone number
		driver.findElement(By.name("reg_email__")).sendKeys("07056635295");

		//To enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Paultoria");

		//To click the dropdown button of birthday date
		driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("29");

		//To scroll the end of the page
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		//To click the dropdown button of birthday month
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("August");

		//To click the dropdown button of birthday month
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2017");

		//click on search button
		driver.findElement(By.name("sex")).click();

		//click on sign up botton
		driver.findElement(By.name("websubmit")).click();

		//enter email or phone number
		driver.findElement(By.name("email")).sendKeys("07038775572");

		//enter password
		driver.findElement(By.name("pass")).sendKeys("school1");	

		//click on login botton
		driver.findElement(By.id("u_0_b")).click();

		//close driver 
		driver.close();
		driver.quit();
		System.out.println("Sign up and login test completed successfully");

	}			
}