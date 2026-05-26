package Basic;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Cookies {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.facebook.com");
    	 
//    	 Cookie newcookkie= new Cookie("qspider velacherry","selenium");
//    	 driver.manage().addCookie(newcookkie);
//		 driver.manage().deleteAllCookies();
//    	 driver.manage().deleteCookieNamed("datr");
    	 System.out.println(driver.manage().getCookieNamed("datr"));
//    	 Set<Cookie> allcookies = driver.manage().getCookies();
//    	 for (Cookie cookie : allcookies) {
//    		 System.out.println(cookie);
    		 Thread.sleep(3000);
    		 driver.quit();
    	 }
    	 
	}

//}
