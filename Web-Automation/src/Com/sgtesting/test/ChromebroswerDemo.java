package Com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebroswerDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args)

	{

		launchBrowser();
		navigate();
		CloseApplication();

	}
	private static void launchBrowser()
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
			oBrowser.get("http://localhost:8080/login.do");
			Thread.sleep(5000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseApplication()
	{
		try 
		{
			//oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
