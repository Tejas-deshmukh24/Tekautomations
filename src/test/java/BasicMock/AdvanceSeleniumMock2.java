package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceSeleniumMock2 {
	
	@Test
	public void spotifysongs() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://open.spotify.com/");
	
		
/*		driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tejasdeshmukh6714@gmail.com");
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hvvTXU encore-bright-accent-set']")).click();*/
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();	
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("tejasdeshmukh6714@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
		
	    WebElement search =	driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']"));
	           search.sendKeys("Arjit");
	           driver.findElement(By.xpath("//div[@class='e-9960-text encore-text-title-medium encore-internal-color-text-base A49BHvl5C1wTQ0ZGCq6V']")).click();
	           
	   //      driver.findElement(By.linkText("Songs")).click();
	  //       driver.findElement(By.xpath("//div[@class='IjYxRc5luMiDPhKhZVUH UpiE7J6vPrJIa59qxts4 ZgAJecvDDVREPXktThbA JgERXNoqNav5zOHiZGfG']//div[@class='ucB9avGYvzsmzXUOw0S7']")).click();
	           
	           Thread.sleep(2000);
	           driver.findElement(By.xpath("//div[@class='fS0C4IgbHviZxIVGC736']//button[@class='e-9960-icon e-9960-baseline zOsKPnD_9x3KJqQCSmAq']")).click();
	           
     //        driver.findElement(By.xpath("(//*[name()='path'])[48]")).click();
		
	           
	}

}
