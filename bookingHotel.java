package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Booking_Hotel {
	
	@Test
	public void hotel() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("//div[@class='e1e158e66b afdff78c97 ce103e449e fe169dc72b']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[@data-date='2026-03-26']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-date='2026-03-30']")).click();
		driver.findElement(By.xpath("(//span[@class='be2db1c937'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ec1ff2f0cb'])[3]")).click();
		driver.findElement(By.xpath("//div[@class='b769347817 a7e79c28d6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='d755458b0f'])[1]")).click();
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,900)");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("(//select[@class='hprt-nos-select js-hprt-nos-select'])[1]")).click();
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
