package com.bacis;

import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\Chhrom\\chromedriver.exe");
		
		WebDriver D = new ChromeDriver();
		
		D.get("http://automationpractice.com/index.php");
		
		D.manage().window().maximize();
		
		WebElement women = D.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		
		Actions a = new Actions(D);
		
		a.moveToElement(women).build().perform();
		
		WebElement tshirt = D.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		
		a.click(tshirt).build().perform();
		
		JavascriptExecutor sc = (JavascriptExecutor) D;
		
		sc.executeScript("window.scrollBy(0,650)");
		
		D.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement pr = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
		
		a.moveToElement(pr).build().perform();
		
		a.click(pr).build().perform();
		
		D.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ifram = D.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe"));
		
		D.switchTo().frame(ifram);
		
		Thread.sleep(3000);
		
		WebElement c = D.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[2]/div/fieldset[2]/div/ul/li[2]/a"));
		
		a.click(c).build().perform();
		
		WebElement ca = D.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button/span"));
		
		a.click(ca).build().perform();
		
		D.switchTo().defaultContent();
		
	//	D.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		WebElement ch = D.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		
		a.moveToElement(ch).build().perform();
		
		a.click(ch).build().perform();
		
		Thread.sleep(3000);
		
		WebElement chc = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		
		a.click(chc).build().perform();
		
		Thread.sleep(3000);
		
		WebElement g = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
		
		g.sendKeys("bcbc@gmail.com");
		
		WebElement pa = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
		
		pa.sendKeys("Sugu@1510");
		
		WebElement l = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
		
		a.click(l).build().perform();
		
		Thread.sleep(3000);
		
		WebElement cp = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		
		a.click(cp).build().perform();
		
		Thread.sleep(3000);
		
		WebElement clic = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		
		a.click(clic).build().perform();
		
		WebElement c1 = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
		
		a.click(c1).build().perform();
		
		Thread.sleep(3000);
		
		WebElement bu = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
		
		a.click(bu).build().perform();
		
		Thread.sleep(3000);
		
		WebElement ch1 = D.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		
		a.click(ch1).build().perform();
		
		JavascriptExecutor ac = (JavascriptExecutor) D;
		
		ac.executeScript("window.scrollBy(0,500)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}
