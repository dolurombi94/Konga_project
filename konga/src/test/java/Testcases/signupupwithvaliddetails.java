package Testcases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basetest.basetest;
import testDatas.validSignUpDatas;

public class signupupwithvaliddetails extends basetest {
	@Test(dataProvider="validsignupData", dataProviderClass=validSignUpDatas.class)
	public void signuptestcase(String firstname,String lastname,String email,String phonenum,String password)
	{ 
		//Setting explicit wait of 20seconds 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//clicking on the signup/signin  button
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div/div[1]/div/div/div[4]/a"))).click();
		
		//click on the Signup link
		WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Don’t have an account? Sign Up')]")));
		clickable.click();
		
		//input valid signupdata in all required field
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname"))).sendKeys(firstname);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lastname"))).sendKeys(lastname);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys(email);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phone"))).sendKeys(phonenum);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[2]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"))).sendKeys(password);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[2]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/button[1]"))).click();
		
	}
	
	
}
