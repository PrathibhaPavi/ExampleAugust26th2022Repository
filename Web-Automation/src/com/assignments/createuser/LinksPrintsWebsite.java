package com.assignments.createuser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPrintsWebsite {
	public static WebDriver  oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		linkList();	
		printLinks();
		linkswithNames();
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
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int linkscount=olinks.size();
		System.out.println("# of Links :"+linkscount);
	}catch(Exception e)
	{
		e.printStackTrace();	
	}
    }
private static void printLinks()
{
	try
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int linkscount=olinks.size();
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			System.out.println(linkname);
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void linkswithNames()
{
	try
	{
		//Click operation on Link, Its name ends with "Apache"
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		int linkscount=olinks.size();
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("Apache"))
			{
				link.click();
				break;
			}
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

