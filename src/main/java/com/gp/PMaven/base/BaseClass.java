package com.gp.PMaven.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static  String url;
	public static  Properties prop =new Properties();
	
	public BaseClass() {
		// TODO Auto-generated constructor stub
		
		try {
			FileInputStream fis = new FileInputStream("D:\\AHM\\PMaven\\src\\main\\java\\com\\gp\\PMaven\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		url = prop.getProperty("url");
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}	
	
	
	
	public void closeBrowser() {
		driver.close();
	}
	
}
