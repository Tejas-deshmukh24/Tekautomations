package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomationPractice_drag_and_dop {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			
			WebElement dragAndDrop = driver.findElement(By.xpath("//h2[.='Drag and Drop']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", dragAndDrop);
			WebElement origin = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
			WebElement target = driver.findElement(By.xpath("//p[.='Drop here']"));
			Actions act = new Actions(driver);
			act.clickAndHold(origin).moveToElement(target).release().build().perform();
			System.out.println("Drag And Drop Performed Succesfully");
			Thread.sleep(5000);
			driver.quit();

		}

	}
	


