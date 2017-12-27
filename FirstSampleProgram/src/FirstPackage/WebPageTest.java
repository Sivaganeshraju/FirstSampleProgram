package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebPageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void main() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Complete\\Selenium Required Files\\Browser Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/login");
		
						
	}
	@Test
	public void Login(){
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div[1]/div[5]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bookings']/div[2]/div[1]/a/b")));
		WebElement Text = driver.findElement(By.linkText("Rendezvous Hotels"));
		Text.getText();
		System.out.println("Print " + Text);
		
	}
	@AfterTest
	public void close(){
		
		driver.quit();
		
	}
	
	
}
