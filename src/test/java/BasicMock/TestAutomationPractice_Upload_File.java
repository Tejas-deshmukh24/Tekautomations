package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class TestAutomationPractice_Upload_File {

		public static void main(String[] args) throws Throwable  {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			
			WebElement uploadFile = driver.findElement(By.xpath("//h2[.='Upload Files']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", uploadFile);
			WebElement uploadElement = driver.findElement(By.id("singleFileInput"));
			uploadElement.sendKeys("C:\\Users\\lmart\\Downloads\\Selenium_Interview_QA.pdf");
			driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
			Thread.sleep(2000);
			
		}
		

	}
