package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddToCartFromRecommendedItem {
	
	@Test
	public void AddToCartFromRecommendedItem() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1400).perform();
	
		
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[73]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
		
		
	}

}
