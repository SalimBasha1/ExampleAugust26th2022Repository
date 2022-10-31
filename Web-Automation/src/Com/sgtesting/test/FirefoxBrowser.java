package Com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowser {

	public static  WebDriver oBrowser=null;
	public static void main(String[] args) 
	
	{
		launchbrowser();
		navigate();
		closeapplication();
	}

	private static void launchbrowser() 
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\src\\Library\\selenium\\driver\\geckodriver.exe");
			oBrowser=new FirefoxDriver();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://en.wikipedia.org/wiki/Feed/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeapplication()
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
