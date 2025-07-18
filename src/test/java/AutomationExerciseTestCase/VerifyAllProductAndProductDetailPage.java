package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerifyAllProductAndProductDetailPage {
	
	@Test
	 public void VerifyAllProductAndProductDetailPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"))).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]")).click();
		
		
		
		
	}

}
