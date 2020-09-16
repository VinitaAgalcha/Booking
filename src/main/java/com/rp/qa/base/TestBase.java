package com.rp.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rp.qa.util.TestUtil;

  public class TestBase {
     
	public static WebDriver driver;
	public static Properties prop;
	
	

			     public TestBase(){
			    	    	try {
			    	    	 prop = new Properties();
			    	    	 FileInputStream ip = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Softwares\\BookingFramework\\src\\main\\java\\com\\rp\\qa\\config\\config.properties");
			    	    	 prop.load(ip);
			    	    	 							
						  } catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						  }catch (IOException e)
			    	    	{
							e.printStackTrace();
			    	    	}
			    	     
		             }
	     
   public static void intiliazation()
	    {
	    	String BrowserName= prop.getProperty("browser");
	    	
	    	if(BrowserName.equals("chrome")){
	    	 	System.setProperty("webdriver.chrome.driver", "D:/Java/selenium/chromedriver.exe");
	    		 driver = new ChromeDriver();
	    	  }
	    	else if(BrowserName.equals("firefox")){
	    		System.setProperty("webdriver.chrome.driver", "D:/Java/selenium/geokodriver.exe");
	    		 driver = new FirefoxDriver();
	    	  }
	    	else{
	    		System.out.println("Not available");
	    	  }
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timout, TimeUnit.SECONDS);
	    	//driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
	    		driver.get(prop.getProperty("url"));
	    	
	    	
	    	}
	    }

