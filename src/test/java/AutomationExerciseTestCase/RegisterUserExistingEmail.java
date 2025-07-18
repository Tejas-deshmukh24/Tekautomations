package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUserExistingEmail {
	
	@Test
	public void RegisterUserExestingEmail() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		driver.findElement(By.name("name")).sendKeys("Tejas Deshmukh");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("tejas460@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		
	}

}
