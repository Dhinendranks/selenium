package Basic;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.id("select3"));
//		 Thread.sleep(2000);
		 
		 Select sel = new Select(ele);
		 sel.selectByIndex(7);
		 Thread.sleep(3000);
		 sel.selectByValue("Germany");
		 Thread.sleep(3000);
		 sel.selectByContainsVisibleText("China");
		 
//		 Thread.sleep(3000);
//		 driver.quit();
		 Thread.sleep(2000);
		 sel.getWrappedElement().click();
		 Thread.sleep(3000);
		 sel.getWrappedElement().sendKeys("Canada");
		 System.out.println(sel.getWrappedElement().getText());
		 
		 Thread.sleep(3000);
     	 driver.quit();
		 
		 

	}

}
