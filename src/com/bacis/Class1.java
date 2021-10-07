package com.bacis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Class1 {
	
	static WebDriver g;
	
	public static void link(String s) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\c\\chromedriver.exe");
		
		g = new ChromeDriver();
		
		g.get(s);

	}
	
	public static void close() {
		
		g.close();

	}
	
	public static void quits() {
		
		g.quit();

	}
	
	public static void navigateto(String s) {
		
		g.navigate().to(s);

	}
	
	public static void navigateback() {
		
		g.navigate().back();

	}
	
	
	public static void navigateforward() {
		
		g.navigate().forward();

	}
	
	public static void navigaterefresh() {
		
		g.navigate().refresh();

	}
	
	public static void url(String s) {
		
		g.get(s);

	}
	
	public static void Alerts() {
		
		g.switchTo().alert().accept();

}
	
	public static void click(String S) {
		
		WebElement findElement = g.findElement(By.xpath(S));
		
		findElement.click();

	}
	
	public static void frames(String s) {
		
		WebElement findElement = g.findElement(By.name(s));
		
		g.switchTo().frame(findElement);
	}
	
	public static void sendkeys(String s, String s1) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		findElement.sendKeys(s1);

	}
	
	public static void getoptions(String s) {
		
		List<WebElement> findElements = g.findElements(By.xpath(s));
		
		for (WebElement webElement : findElements) {
			
			String text = webElement.getText();
			
			System.out.println(text);
		}

	}
	
	public static void selectvisibletexts(String s,String i) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		Select c = new Select(findElement);
		
		c.selectByVisibleText(i);

	}
	
	
	public static void selectvisiblevalues(String s, String i) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		Select c = new Select(findElement);
		
		c.selectByValue(i);

	}
	
	public static void actions(String s) {
		
		Actions c = new Actions(g);
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		c.contextClick(findElement).build().perform();
		
	}
	
	public static void robots() throws AWTException {
		
		Robot c = new Robot();
		
		c.keyPress(KeyEvent.VK_DOWN);
		
		c.keyRelease(KeyEvent.VK_DOWN);
		
		c.keyPress(KeyEvent.VK_ENTER);
		
		c.keyRelease(KeyEvent.VK_ENTER);
		

	}
	
	public static void windows() {
		
		Set<String> windowHandles = g.getWindowHandles();
		
		List <String> win = new ArrayList<>(windowHandles);
		
		for (String string : win) {
			
			String c = g.getTitle();
			
			System.out.println(c);
			
		}
		
	}
	
	public static void enabled(String s) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		boolean enabled = findElement.isEnabled();
		
		System.out.println(enabled);

	}
	
	public static void displayed(String s) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		boolean displayed = findElement.isDisplayed();
		
		System.out.println(displayed);

	}
	
	public static void selected(String s) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		boolean selected = findElement.isSelected();
		
		System.out.println(selected);
	}
	
	public static void getcurrenturl() {
		
		String currentUrl = g.getCurrentUrl();
		
		System.out.println(currentUrl);

	}
	
	public static void getoptionsg(String s) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		Select c = new Select(findElement);
		
		List<WebElement> l = c.getOptions();
		
		System.out.println(l);
	}
	
	public static void scroll(String s) {
		
		JavascriptExecutor sc = (JavascriptExecutor) g;
		
		sc.executeScript(s);

	}
	
	public static void view(String s) {
		
		WebElement findElement = g.findElement(By.xpath(s));
		
		Actions c = new Actions(g);
		
		c.moveToElement(findElement).build().perform();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
