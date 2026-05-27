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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Rare_Rabbit {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://thehouseofrare.com/");
		
		Actions act = new Actions(driver);
		 WebElement ele = driver.findElement(By.partialLinkText("MEN"));
		 act.moveToElement(ele).perform();
		 
		 WebElement ele1 = driver.findElement(By.xpath("(//a[text()='CLOTHING'])[1]"));
		 act.moveToElement(ele1).perform();
		 
		 driver.findElement(By.xpath("(//a[text()='COMING SOON'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='product-main-inner'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[@class='swatch-image'])[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[@class='size-title'])[2]")).click();
		 Thread.sleep(1000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(0,400)");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='add-to-cart-js add-to-cart-button button-full border-button']")).click();
		 Thread.sleep(1000);
		 
		 WebElement ele2 = driver.findElement(By.xpath("//div[@class='cart-drawer-section']"));
		 TakesScreenshot ele21= (TakesScreenshot) driver;
		 File temp = ele21.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/Elements.png");
			FileHandler.copy(temp, dest);
		 
		 Thread.sleep(3000);
		 driver.quit();
		 
		 
		 
		 


	}

}
