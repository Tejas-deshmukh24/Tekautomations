package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PlaceOrderLoginBeforeCheckout {
	
	@Test
	public void PlaceOrderLoginBeforeCheckout() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tejas460@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//a[@href='/brand_products/Biba']"))).perform();
		
        driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]")).click();
		
		driver.findElement(By.id("quantity")).clear();
		driver.findElement(By.id("quantity")).sendKeys("4");
		
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
		
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
		
		Actions action2 = new Actions(driver);
		action2.scrollToElement(driver.findElement(By.xpath("//label[contains(text(),'If you would like to add a comment about your orde')]"))).perform();
		
        driver.findElement(By.name("message")).sendKeys("Hi Order is Conform");
        driver.findElement(By.linkText("Place Order")).click();
        
        driver.findElement(By.name("name_on_card")).sendKeys("SBI Card");
        driver.findElement(By.xpath("//input[@data-qa='card-number']")).sendKeys("75896412358");
        driver.findElement(By.xpath("//input[@data-qa='cvc']")).sendKeys("8568");
        driver.findElement(By.xpath("//input[@data-qa='expiry-month']")).sendKeys("08");
        driver.findElement(By.xpath("//input[@data-qa='expiry-year']")).sendKeys("2026");
        
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        		
		
		
		
	}

}
