package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContactUsForm {
	
	@Test
	public void ContactUsForm() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Tejas Deshmukh");
		driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("tejas780@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("JavaSelenium");
		driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("I learn traning JavaSelenium in TekPyramid");
		
		 
       WebElement upButton = driver.findElement(By.name("upload_file"));
       Thread.sleep(2000);
       upButton.sendKeys( "C:\\Users\\Tejas\\OneDrive\\Desktop\\TekPyramid\\CommonD.properties");
		
       Actions action = new Actions(driver);
	   action.scrollToElement(driver.findElement(By.id("susbscribe_email"))).perform();
		
		
		driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
