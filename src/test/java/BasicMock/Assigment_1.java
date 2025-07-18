package BasicMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assigment_1 {
	
	@Test
	
	public void getscreenshot() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']")).click();
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 200).perform();

	//1
		driver.findElement(By.xpath("//div[@class='buttons']//input[@class='button-2 product-box-add-to-cart-button']")).click();
		Actions act1=new Actions(driver);
		act1.scrollByAmount(0, 400).perform();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	//2
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Actions act2=new Actions(driver);
		act2.scrollByAmount(0, 400).perform();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-16']")).click();
		

		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		
		
	}

}
