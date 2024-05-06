package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basetest.basetest;
import testDatas.signindatas;

public class validlogintest extends basetest {
	@Test(dataProvider="validsignuudata",dataProviderClass=signindatas.class)
	public void validpasswordandemail(String email, String password) 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		try 
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Login / Signup']"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='username']"))).sendKeys(email);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[4]/section[1]/section[1]/aside[1]/div[2]/div[1]/form[1]/div[2]/input[1]"))).sendKeys(password);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']"))).click();
		}
		catch(Exception e) 
		{
			driver.close();
		}
		
	}
}
