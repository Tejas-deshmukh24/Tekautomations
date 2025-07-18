package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class CandyMapper {

		public static void main(String[] args) throws Throwable  {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
			driver.get("https://candymapper.com/");
			// explicitly wait
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			// wait until close button is clickable
//			WebElement popupcloseBtn = wait
//					.until(ExpectedConditions.elementToBeClickable(By.id("popup-widget307423-close-icon")));
//			popupcloseBtn.click();
//			wait.until(ExpectedConditions.invisibilityOf(popupcloseBtn));
			
			driver.findElement(By.xpath("//*[@id='popup-widget307423-close-icon']")).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement text = driver.findElement(By.xpath("//span[contains(text(), 'Slider Challenge')]"));
			js.executeScript("arguments[0].scrollIntoView(true);", text);
			WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id, 'iframe-undefined')]"));
			driver.switchTo().frame(frame);
			Thread.sleep(2000);
			WebElement countyDropdown = driver.findElement(By.xpath("//*[@name='tCounty']"));
			countyDropdown.click();
			Thread.sleep(2000);
			
			Select select = new Select(countyDropdown);
			Thread.sleep(2000);
			select.selectByVisibleText("Devon");
			Thread.sleep(2000);
			driver.quit();

		}

	}







	//package firstMock.execution;
	//
	//import java.time.Duration;
	//
	//import org.openqa.selenium.By;
	//import org.openqa.selenium.JavascriptExecutor;
	//import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.support.ui.ExpectedConditions;
	//import org.openqa.selenium.support.ui.Select;
	//import org.openqa.selenium.support.ui.WebDriverWait;
	//
	//public class CandyMapper {
	//
//		public static void main(String[] args) throws InterruptedException {
//			WebDriver driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.manage().window().maximize();
//			driver.get("https://candymapper.com/");
//			// explicitly wait
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			// wait until close button is clickable
//			WebElement popupcloseBtn = wait
//					.until(ExpectedConditions.elementToBeClickable(By.id("popup-widget307423-close-icon")));
//			popupcloseBtn.click();
//			wait.until(ExpectedConditions.invisibilityOf(popupcloseBtn));
//			// scrolldown till
//			WebElement sliderChallenge = driver
//					.findElement(By.xpath("//span[.='Slider Challenge: Select Worcestershire']"));
//			JavascriptExecutor java = (JavascriptExecutor) driver;
//			java.executeScript("arguments[0].scrollIntoView(true);", sliderChallenge);
	//
//			WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id, 'iframe-undefined')]"));
//			driver.switchTo().frame(frame);
//			Thread.sleep(2000);
//			WebElement countyDropdown = driver.findElement(By.xpath("//*[@name='tCounty']"));
//			countyDropdown.click();
//			Thread.sleep(2000);
//			Select select = new Select(countyDropdown);
//			Thread.sleep(2000);
//			select.selectByVisibleText("Bristol");
//			Thread.sleep(2000);
//			driver.quit();
	//
////			// select.selectByVisibleText("Greater London");
////			// driver.findElement(By.id("//select[@id='tCounty' and @class='form-control
////			// dropdown']")).click();
////			driver.findElement(By.xpath("//select[@id='tCounty']/option[.='Greater London']")).click();
////			countyDropdown.click();
////			Thread.sleep(2000);
////			System.out.println("country entered succesfully");
////			driver.quit();
//		}
	//
	//}
	

