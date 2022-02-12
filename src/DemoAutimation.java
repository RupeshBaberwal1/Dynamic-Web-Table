import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutimation {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\97\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.findElement(By.name("searchVal")).sendKeys("Jeans");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("searchVal")).sendKeys(Keys.RETURN);
		
//		List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath("//div[@class=\"contentHolder\"]"));
//		List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));
//		System.out.println("Number of elements:" +elements.size());
//		System.out.println("Number of elements links:" +links.size());
		//System.out.println("Number of elements links:" +links.get);
	//	System.out.println(link.getText() + ” – ” + link.getAttribute(“href”));
		
//		for(int i = 1 ; i<elements.size(); i++) {
//			
//			if(i==5) {
//				break;
//			}
//			System.out.println(elements);
//			
//		}
		
//		int maxm = 5;
//		for(WebElement link:links){
//			 System.out.println(link.getText() + " - " + link.getAttribute("href")+ " - " + link.getSize());
//			 if(link == maxm) 
//				 break;
//			 }
		
//		for (WebElement webElement : elements) {
//          String name = webElement.getText();
//          System.out.println(name);
//      }
//		String size1 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[1]")).getText();
//		String size2 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[2]")).getText();
//		String size3 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[3]")).getText();
//		String size4 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[4]")).getText();
//		String size5 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[5]")).getText();
//		String size6 = driver.findElement(By.xpath("(//div[@class=\"contentHolder\"])[6]")).getText();
//		
//		System.out.println(size1);
//		System.out.println(size2);
//		System.out.println(size3);
//		System.out.println(size4);
//		System.out.println(size5);
//		System.out.println(size6);
		
//		List<WebElement> bakeries = (List<WebElement>) driver.findElement(By.xpath("//div[@class='items']//div"));
//
//        System.out.println(bakeries.size());
//
//        for (WebElement webElement : size) {
//            String name = webElement.getText();
//            System.out.println(name);
//        }
		
//		



	}

}