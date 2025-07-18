package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifySubscriptionCartPage {
	
	@Test
	public void VerifySubscriptionCartPage() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.partialLinkText("Cart")).click();
		
		WebElement 	cartsubscription=driver.findElement(By.id("susbscribe_email"));
		//.sendKeys("tejas@123gmail.com");
        WebElement cartbutton=driver.findElement(By.xpath("//button[@id='subscribe']"));
        //.click();

       cartsubscription.sendKeys("tejas460@gmail.com",Keys.TAB,"cartbutton",Keys.ENTER); 

	}

}
