package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basetest.basetest;

public class practice extends basetest{
	@Test
	public void tryadd() 
	{
		Actions action = new Actions(driver);
		WebElement help=driver.findElement(By.xpath("//a[normalize-space()='Help']"));
		action.moveToElement(help);
		action.perform();
		List <WebElement> droplist =driver.findElements(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[3]/ul"));
		
		for(WebElement ele:droplist) 
		{
			String value =ele.getText();
			System.out.println(value);
			
			if(value.equalsIgnoreCase("Track My Order")) 
			{
				ele.click();
				break;
			}
			
		}
	}

}
