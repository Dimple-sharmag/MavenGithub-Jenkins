package com.HRM.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase()
	{
		try {
		FileInputStream ip=new FileInputStream("E:\\java_program\\com.OrangeLivePOM\\src\\main\\java\\com\\HRMConfiguration\\config.properties");
		prop=new Properties();
		prop.load(ip);//load method will all the properties mentioned in properties file
	}
		catch (IOException e) {
			e.printStackTrace();
			
		}

}
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
}
