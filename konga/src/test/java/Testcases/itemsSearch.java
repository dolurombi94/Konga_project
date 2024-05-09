package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basetest.basetest;

public class itemsSearch extends basetest {
	@Test
	public void SearchItemFunctionalityTest() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='f6ed2_25oVd']//input[@id='jsSearchInput']"))).sendKeys("iphone");
		driver.findElement(By.xpath("//form[@class='f6ed2_25oVd']//button[@aria-label='Search']//*[name()='svg']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Price - Low To High']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c6dfe_HidJc']//div[3]//div[2]//ul[1]//li[4]//a[1]//label[1]"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[normalize-space()='Apple iPhone 15 Pro Max - 6.7\" -...']"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Min']"))).clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Min']"))).sendKeys("1000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Max']"))).clear();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Max']"))).sendKeys("20000");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='GO']"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[normalize-space()='Silicone Case For iPhone 11 Pro ...']"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='f2e4b_7TAFW _2851e_9iQD7']//div//button[@name='increment'][normalize-space()='+']"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class,'_841f1_1RZK9 c67d6_fW9F4 fa349_iMSgI')]//button[@type='submit'][normalize-space()='Add To Cart']"))).click();
		
	}
}
