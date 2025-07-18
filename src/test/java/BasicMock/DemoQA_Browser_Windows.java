package BasicMock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	
	public class DemoQA_Browser_Windows {

		public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
			String parentWin = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			WebElement element1 = driver.findElement(By.xpath("//button[.='New Window Message']"));
			JavascriptExecutor java= (JavascriptExecutor)driver;
			java.executeScript("arguments[0].scrollIntoView(true);", element1);
			element1.click();
			for(String win:allWin) {
				if (!win.equals(parentWin)) {
						driver.switchTo().window(win);
						break;
				}
			}		
			//driver.findElement(By.xpath("//body")).getText();
			String bodyText = driver.findElement(By.xpath("//body")).getText();
			System.out.println(bodyText);
			System.out.println("Knowledge increases by sharing "
					+ "but not by saving. "
					+ "Please share this website with your friends and in your organization.");
			driver.switchTo().window(parentWin);
			//driver.quit();
			
			
		}
				
	}	


