package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchProductsAndVerifyCartAfterLogin {
	
	@Test
	
	public void SearchProductsAndVerifyCartAfterLogin() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		driver.findElement(By.id("search_product")).sendKeys("Polo");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
	//	WebElement text=driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"));
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 300).perform();
	
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
		
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tejas460@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		
		
		
		
		
	}

}
