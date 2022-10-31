package com.assignments.createuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		List();
		footer();		
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
		oBrowser.get("https://www.google.com/");
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void List()
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
private static void footer()
{
	try
	{
		java.util.List<WebElement> Footer=oBrowser.findElements(By.tagName("footer"));
		int footerLinksCount=oBrowser.findElements(By.tagName("h")).size();
		System.out.println("Footerlinks:"+footerLinksCount);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
}
    

