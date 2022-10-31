package com.assignments.createuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksLinkedin {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		List();
		printLinks();
		footer();

	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("https://www.linkedin.com/");
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
	private static void printLinks()
	{
		try
		{
			java.util.List<WebElement> totalLinksCount=oBrowser.findElements(By.tagName("a"));
			for(int i=0;i<totalLinksCount.size();i++)
			{
				System.out.println("Links on Pages:"+totalLinksCount.get(i).getDomAttribute("href"));
				System.out.println("Link text on Pages :"+totalLinksCount.get(i).getText());
			}
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
			int footerLinksCount=oBrowser.findElements(By.tagName("a")).size();
			System.out.println("Footerlinks:"+footerLinksCount);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
