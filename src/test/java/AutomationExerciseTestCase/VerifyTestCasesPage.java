package AutomationExerciseTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTestCasesPage {
	
	@Test
	public void VerifyTestCasesPage() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.automationexercise.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Test Cases']")).click();
		
		
	}

}
