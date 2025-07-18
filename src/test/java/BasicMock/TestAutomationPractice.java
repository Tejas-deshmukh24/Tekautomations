package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationPractice { 

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");	
			
			WebElement scrollDropdown = driver.findElement(By.xpath("//h2[.='Scrolling DropDown']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", scrollDropdown);
			driver.findElement(By.xpath("//input[@id='comboBox']")).click();
			WebElement option = driver.findElement(By.xpath("//div[@id='dropdown']/div[.='Item 10']"));
			js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", option);
			option.click();
			Thread.sleep(2000);
			System.out.println("Scrolling DropDown task completed==PASS");	
		}

	}


