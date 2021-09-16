package com.wiki.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() 
	{
		// get the properties
		 prop = new Properties();
		 FileInputStream file = null;
		 try {
			file = new FileInputStream("C:\\Ashwini\\workspace\\POMFRAMEWORK\\src\\main\\java\\com\\wiki\\qa\\config\\configration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
