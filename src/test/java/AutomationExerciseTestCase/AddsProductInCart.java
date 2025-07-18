package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddsProductInCart {
	
	@Test
	
	public void AddsProductInCart() throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"))).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[3]")).click();
		
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
		
	}

}
