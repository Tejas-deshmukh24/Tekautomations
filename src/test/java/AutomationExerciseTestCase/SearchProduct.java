package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchProduct {
	
	@Test
	
	public void SearchProduct() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
        WebElement search=driver.findElement(By.id("search_product"));
        WebElement button=driver.findElement(By.id("submit_search"));
		
		search.sendKeys("Winter Top",Keys.TAB,"button",Keys.ENTER); 
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"))).perform();
		
	
		
	}

}
