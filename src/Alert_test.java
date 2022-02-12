import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_test {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		//driver.get("https://www.browserstack.com/users/sign_up");
//		driver.get("http://www.naukri.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		Robot robot = new Robot();
//		//driver.switchTo().alert().accept();
//		driver.findElement(By.id("accept-cookie-notification")).click();
//		driver.findElement(By.id("user_full_name")).sendKeys("username");
//		driver.findElement(By.id("user_email_login")).sendKeys("demo@gmail.com");
//		//driver.findElement(By.id("user_submit")).click();
	//	System.setProperty("webdriver.chrome.driver", "C:UsersNeha_VaidyaDesktopchromedriver_win32chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Courses")).click();
        Robot robot = new Robot();
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        //robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_ENTER);
        

	}

}
