package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PlaceOrderRegisterBeforeCheckout {
	
	@Test
	
	public void PlaceOrderRegisterBeforeCheckout() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		    driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		    driver.findElement(By.name("name")).sendKeys("Tejas Deshmukh");
			
			driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("tejas4477@gmail.com");
			
			driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
			
			driver.findElement(By.id("id_gender1")).click();
			driver.findElement(By.id("password")).sendKeys("12345810");
			
			WebElement day=driver.findElement(By.id("days"));
			Select select=new Select(day);
			select.selectByValue("24");
			
			WebElement month=driver.findElement(By.id("months"));
			Select select1=new Select(month);
			select1.selectByVisibleText("May");
			
			WebElement years=driver.findElement(By.id("years"));
			Select select2=new Select(years);
			select2.selectByValue("1998");
				
			Actions action = new Actions(driver);
			action.scrollToElement(driver.findElement(By.xpath("//label[normalize-space()='Company']"))).perform();
			
		    driver.findElement(By.id("newsletter")).click();
		    driver.findElement(By.id("optin")).click();
	
		    Thread.sleep(2000);	
		
			driver.findElement(By.id("first_name")).sendKeys("Tejas");
			driver.findElement(By.id("last_name")).sendKeys("Deshmukh");
			driver.findElement(By.id("company")).sendKeys("TekPyramid");
			driver.findElement(By.id("address1")).sendKeys("LaxmiChoke");
			driver.findElement(By.id("address2")).sendKeys("DangeChoke");
			
			WebElement country=driver.findElement(By.id("country"));
			Select select3=new Select(country);
			select3.selectByVisibleText("India");
			
			Actions action1 = new Actions(driver);
			action1.scrollToElement(driver.findElement(By.xpath("//label[@for='mobile_number']")));
			
			driver.findElement(By.id("state")).sendKeys("Maharashtra");
			driver.findElement(By.id("city")).sendKeys("Pune");
			driver.findElement(By.id("zipcode")).sendKeys("444708");
			driver.findElement(By.id("mobile_number")).sendKeys("9577851296");	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click(); 
			driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
			
			
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
