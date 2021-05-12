package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public double value1 = 122365.24;
	public double value2 = 599.00;
	public double value3 = 850139.99;
	public double value4 = 23329.50;
	public double value5 = 566.27;
	public double TotalBalanceValue = 1000000.00;
	
	
	public MainBaseClass() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\git\\Exercise\\Exercise\\src\\main\\java\\com\\config\\config.properties");
			prop.load(fis);
		}catch(IOException e) {
		e.getMessage();
		}
		}
	
	
	public static void initialization()
	{

      String browserName = prop.getProperty("browser");
      
      if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\Exercise\\Exercise\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
      }
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
      driver.get(prop.getProperty("url"));
		
	
	}
	
}
	

