package BasicMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clinique {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://www.clinique.in/");
			
			driver.findElement(By.xpath("//div[@id='gnav-account-container']//*[local-name()='svg']")).click();
			driver.quit();

		}

	}


