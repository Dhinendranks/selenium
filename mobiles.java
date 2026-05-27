package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sangetha_mobiles {

//	public static void main(String[] args) throws InterruptedException, IOException {
	@Test
	public void Sangeetha() throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.sangeethamobiles.com/");
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,100)");
		
		driver.findElement(By.xpath("(//div[@class='bank_offers__media'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[text()='Samsung Galaxy S26 Ultra 12GB 512GB White']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		Thread.sleep(1000);
		  TakesScreenshot ts = (TakesScreenshot) driver;
		    File temp = ts.getScreenshotAs(OutputType.FILE);
		    File dest = new File("./screenshots/screenshot.png");
		    FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
