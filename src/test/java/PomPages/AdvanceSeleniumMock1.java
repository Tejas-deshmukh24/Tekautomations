package PomPages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class AdvanceSeleniumMock1 {
	
	@Test
	public void getdata() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
	
		//PageText
		
		WebElement men=driver.findElement(By.xpath("//div[@class='desktop-navContent'][1]"));

		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		
		 String text = driver.findElement(By.xpath("//div[@data-group='men']")).getText();
		 System.out.println(text);
	
		 
		 
	//ScreenShot	 
		 
    WebElement studio = driver.findElement(By.linkText("STUDIO"));
	WebElement vkImg =driver.findElement(By.xpath("//div[@data-reactid='977']"));
	
	act.moveToElement(studio).perform();
	Thread.sleep(2000);
	File src = vkImg.getScreenshotAs(OutputType.FILE);		
	File dest = new File("./screenshot/studio1234.png");
	FileHandler.copy(src,dest);
		
		
			
	}
 
}
