package BasicMock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdvanceSeleniumMock3 {
	
	@Test
	public void Bigbasket() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']//*[name()='svg']")).click();
		
		
        List<WebElement> all = driver.findElements(By.xpath("//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu']nav/ul/li/a"));
        for(WebElement list:all)
        {
        	String data=list.getText();
        	System.out.println(data);
        	Thread.sleep(2000);
        	
        }
	
		
		System.out.println("====================================================================");
		
		System.out.println("Test Case Pass");
	}

}
