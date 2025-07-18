package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ViewCartAndBrandProducts {
	
	@Test
	public void ViewCartAndBrandProducts() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"))).perform();
		
		driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
		
		
		
	}

}
