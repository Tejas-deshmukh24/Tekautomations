package AutomationExerciseTestCase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUserInCorrectID {
	
	@Test
	public void LoginUser() {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.automationexercise.com/");
	
	driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tejas470@gmail.com");
	driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345610");
	driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	

	
	
   }
}
