import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_test {
	
	public static void main(String arg[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\pc\\Desktop\\Demo.java");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		driver.findElement(By.name("send")).click();
	}

}
