package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPress {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keypress(KeyEvent.VK_CAPS_LOCK);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
