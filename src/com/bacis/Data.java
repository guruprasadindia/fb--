package com.bacis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Data {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.Guruprasad\\eclipse-workspace\\Fb\\Chhrom\\chromedriver.exe");
		
		WebDriver g = new ChromeDriver();
		
		g.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		List<WebElement> ha = g.findElements(By.xpath("//table/thead"));
		
		for (int i = 0; i <ha.size(); i++) {
			
			String text = ha.get(i).getText();
			
			System.out.println(text);
		}
		
		
		int data ;
		
		String s = "Airi Satou";
		
		List<WebElement> row = g.findElements(By.xpath("//table/tbody/tr"));
		
		
		for (int i = 0; i < row.size(); i++) {
			
			String text = row.get(i).getText();
			
			System.out.println(text);
			
			if (text.contains(s)) {
				
				data = i;
				
				System.out.println(i);
				
			}
		}
		
		String next = row.get(0).getText().replace(" ", "\n");
		
		System.out.println(next);
			
		}
	}

