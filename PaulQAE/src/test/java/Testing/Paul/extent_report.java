package Testing.Paul;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		import com.aventstack.extentreports.ExtentReports;
		import com.aventstack.extentreports.ExtentTest;
		import com.aventstack.extentreports.Status;
		import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
		
		public class extent_report {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreport.Html");

				//To create ExReports and attach reporter(s)
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(htmlReporter);

				// To create a given test
				ExtentTest test1 = extent.createTest("Google Search test one","this is a test to validate google search one");

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Paul\\Paul_Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();	

				test1.log(Status.INFO, "Starting Test Case");
				driver.get("https://www.google.com/");
				test1.pass("Navigated to google.com");

				//enter text in search box
				driver.findElement(By.name("q")).sendKeys("software automation frame work");
				test1.pass("Enter texst in search box");

				//click on search button
				driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
				test1.pass("Press keyboard enter botton");

				//close driver 
				driver.close();
				driver.quit();
				test1.pass("Close the broswer");

				//calling flush write to everything to the log file
				extent.flush();



				// To create a given test
				ExtentTest test2 = extent.createTest("Google Search test two","this is a test to validate google search two");

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Paul\\Paul_Driver\\chromedriver.exe");
				WebDriver driver1 = new ChromeDriver();	

				test2.log(Status.INFO, "Starting Test Case");
				driver1.get("https://www.google.com/");
				test2.pass("Navigated to google.com");

				//enter text in search box
				driver1.findElement(By.name("q")).sendKeys("update on coronavirus in the world");
				test2.pass("Enter texst in search box");

				//click on search button
				driver1.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
				test2.fail("Press keyboard enter botton");

				//close driver 
				driver1.close();
				driver1.quit();
				test2.pass("Close the broswer");
				
				//calling flush write to everything to the log file
				extent.flush();

			}

		}


