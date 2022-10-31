package Com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebook {

	public static  WebDriver oBrowser=null;

	public static void main(String[] args) {

		launchbroswer();
		navigate();
		login();
		logout();
		closeApplication();

	}
	private static void launchbroswer()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Driver\\chromedriver.exe" );
			oBrowser = new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{

			oBrowser.get("https://in.indeed.com/");
			Thread.sleep(5000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='EmployersPostJob']")).click();
			oBrowser.findElement(By.linkText("Sign in")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"ifl-InputFormField-3\"]")).sendKeys("maxthompson2048@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\"emailform\"]/button")).click();	
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try
		{

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{

			oBrowser.quit();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
