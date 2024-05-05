package Basetest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {
	public static WebDriver driver;
	Properties properties = new Properties();
@BeforeTest
	public void readpropertyfile() throws IOException {
		// Reading Property.config file
		FileReader filereader = new FileReader(
				"/Users/macuser/eclipse-workspace/Konga_project/konga/src/test/resources/utilities/config.property");
		properties.load(filereader);
		
		if (properties.getProperty("browser").equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		String baseurl = properties.getProperty("baseurl");
		driver.get(baseurl);
		driver.manage().window().maximize();

	}

}
