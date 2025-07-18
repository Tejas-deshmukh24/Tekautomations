package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollWithArrow {
	
	@Test
	public void ScrollWithArrow() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"))).perform();
		
//		driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).click();
		
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//html")).click();
		
		Actions act1=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//div[@class='item active']//h1[1]"))).perform();
		
	

	}

}
