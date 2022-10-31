package Com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loginthbrowser {

	public static WebDriver oBrowser=null;

	public static void main(String[] args)
	{

		launchbrowser();
		navigate();
		login();
		minimizeflyoutwidnow();
		logout();
		closebrowser();

	}
	private static void launchbrowser()
	{

		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\Library\\selenium\\driver\\chromedriver.exe");
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
			oBrowser.get("http://localhost:8080/login.do ");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	

	}
	private static void login()
	{

		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwidnow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	private static void closebrowser()
	{
		try
		{
			oBrowser.quit();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
