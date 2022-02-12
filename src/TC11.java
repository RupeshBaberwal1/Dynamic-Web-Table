import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TC11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\\\browserdrivers\\\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\97\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
//		try{			
//		     
//	        File file = new File("Cookies.data");							
//	        FileReader fileReader = new FileReader(file);							
//	        BufferedReader Buffreader = new BufferedReader(fileReader);							
//	        String strline;			
//	        while((strline=Buffreader.readLine())!=null){									
//	        StringTokenizer token = new StringTokenizer(strline,";");									
//	        while(token.hasMoreTokens()){					
//	        String name = token.nextToken();					
//	        String value = token.nextToken();					
//	        String domain = token.nextToken();					
//	        String path = token.nextToken();					
//	        Date expiry = null;					
//	        		
//	        String val;			
//	        if(!(val=token.nextToken()).equals("null"))
//			{		
//	        	expiry = new Date(val);					
//	        }		
//	        Boolean isSecure = new Boolean(token.nextToken()).								
//	        booleanValue();		
//	        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
//	        System.out.println(ck);
//	        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
//	        }		
//	        }		
//	        }catch(Exception ex){					
//	        ex.printStackTrace();			
//	        }
		
		driver.get("https://jiomart-partner.jiohostx2.de/sections/landing-page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
		driver.findElement(By.id("mobileNumber")).sendKeys("9981849845");
		driver.findElement(By.className("select-box")).click();
		driver.findElement(By.xpath("//span[contains(text(), ' Get OTP')]")).click();
		//String demp = driver.findElement(By.xpath("//span[contains(text(), ' Get OTP')]")).getText();
		//System.out.print(demp);
		Thread.sleep(40000);
		driver.findElement(By.xpath("//button[contains(text(), ' Verify ')]")).click();
		driver.findElement(By.id("field")).sendKeys("452015");
		driver.findElement(By.xpath("//div[contains(text(), 'Apply')]")).click();
		
		
		
		
		//driver.navigate().to("https://www.ebay.in/");
//		Actions ac = new Actions(driver);
//		  
//		//ac.moveToElement(driver.findElement(By.xpath("//input[@id=\"searchInput\"]"))).perform();
//		ac.moveToElement(driver.findElement(By.id("searchInput"))).perform();
//		Thread.sleep(3000);
//		driver.findElement(By.id("searchInput")).click();
		
		// create file named Cookies to store Login Information		
        File file = new File("Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }	
		
		
		
			
		

	}

}
