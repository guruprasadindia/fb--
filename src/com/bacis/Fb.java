package com.bacis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\Chhrom\\chromedriver.exe");
		
		WebDriver D = new ChromeDriver();
		
		D.get("https://www.facebook.com/");
		
		WebElement Click = D.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		
		Click.click();
		
		Thread.sleep(3000);
		
		WebElement user = D.findElement(By.name("firstname"));
		
		user.sendKeys("wbkabk");
		
		WebElement name = D.findElement(By.name("lastname"));
		
		name.sendKeys("yoxhkhxvj");
		
		WebElement mobile = D.findElement(By.name("reg_email__"));
		
		mobile.sendKeys("894375977");
		
		WebElement password = D.findElement(By.name("reg_passwd__"));
		
		password.sendKeys("password");
		
		WebElement gender = D.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
		
		gender.click();
		
		Select select = new Select(D.findElement(By.name("birthday_day")));
		
		select.selectByVisibleText("8");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
