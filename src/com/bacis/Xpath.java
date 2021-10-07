package com.bacis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Guruprasad\\eclipse-workspace\\Chrome\\Chrome\\chromedriver.exe");
		
		WebDriver D = new ChromeDriver();
		
		D.get("https://www.facebook.com/");
		
		WebElement mi = D.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		mi.click();
		
		Thread.sleep(4000);
		
		WebElement name = D.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		name.sendKeys("i");
		
		WebElement la = D.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));		
		
		la.sendKeys("India");
		
		WebElement mobile = D.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		
		mobile.sendKeys("9994229069");
		
		WebElement pass = D.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));

		pass.sendKeys("alluarjun");
		
		Select bithday = new Select (D.findElement(By.name("birthday_day")));
		
		bithday.selectByVisibleText("4");
		
		WebElement poin = D.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		
		poin.click();
		
		TakesScreenshot shot = (TakesScreenshot) D;
		
		File source = shot.getScreenshotAs(OutputType.FILE);
		
		File destinaation = new File("C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\Sc\\shot.PNG");
		
		FileUtils.copyFile(source, destinaation);
		
		Select Nov = new Select(D.findElement(By.id("month")));
		
		Nov.selectByValue("11");
		
		Select Bi = new Select(D.findElement(By.name("birthday_year")));
		
		Bi.selectByVisibleText("1998");
		
		TakesScreenshot sc = (TakesScreenshot) D;
		
		File source1 = sc.getScreenshotAs(OutputType.FILE);
		
		File destination2 = new File("C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\Sc\\pic.png");
		
		FileUtils.copyDirectory(source1, destination2);
		
		
		
		 
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
