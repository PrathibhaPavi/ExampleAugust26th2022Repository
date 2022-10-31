package com.assignments.createuser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {
	public static WebDriver  oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		linkList();	
		printLinks();
	}

private static void LaunchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("http://www.google.com/");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void linkList()
{
	try
	{
        int totalLinksCount=oBrowser.findElements(By.tagName("a")).size();
	    System.out.println("Total links:"+totalLinksCount);
	}catch(Exception e)
	{
		e.printStackTrace();	
	}
}
private static void printLinks()
{
	try
	{
	    List<WebElement> totalLinksCount=oBrowser.findElements(By.tagName("a"));
	    for(int i=0;i<totalLinksCount.size();i++)
	{
		System.out.println("Links on page are:"+totalLinksCount.get(i).getAttribute("href"));

		System.out.println("Links on page are:"+totalLinksCount.get(i).getText());	
		
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

}
