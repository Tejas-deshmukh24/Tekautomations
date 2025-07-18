package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerifySubscriptionHomePage {
	
	@Test
	
	public void VerifySubscriptionHomePage() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"))).perform();
		
		WebElement 	homesubscription=driver.findElement(By.id("susbscribe_email"));
				//.sendKeys("tejas@123gmail.com");
		WebElement homebutton=driver.findElement(By.xpath("//button[@id='subscribe']"));
		//.click();
		
		homesubscription.sendKeys("tejas460@gmail.com",Keys.TAB,"homebutton",Keys.ENTER); 
		
	}

}
