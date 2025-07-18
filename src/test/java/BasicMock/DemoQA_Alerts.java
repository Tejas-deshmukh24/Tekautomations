package BasicMock;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA_Alerts {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			WebElement element1 = driver.findElement(By.xpath("//button[@id='promtButton']"));
			JavascriptExecutor java= (JavascriptExecutor)driver;
			java.executeScript("arguments[0].scrollIntoView(true);", element1);
			element1.click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Arpizz");
			alert.accept();
			System.out.println("Promt Alert Handled Successfully");
			Thread.sleep(2000);
			driver.quit();
		}

	}



