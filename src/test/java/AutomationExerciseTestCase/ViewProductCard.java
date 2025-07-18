package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ViewProductCard {
	
	@Test
	public void ViewProductCard() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.xpath("//h2[normalize-space()='Brands']"))).perform();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
		
		
	}

}
