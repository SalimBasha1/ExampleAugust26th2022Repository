package Com.sgtesting.test.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static WebDriver oBrowser=null;
	
	public static void main(String[] args)

	{

		launchbrowser();
		navigate();
		login();
		minimizeflyoutwidnow();
	    createuser1();
		createuser2();
		createuser3();
		logout();

		loginuser1();
		clickclosevideo();
		logout();

		loginuser2();
		clickclosevideo();
		logout();

		loginuser3();
		clickclosevideo();
		logout();

		loginuser1();
		modifyUser1();
		logout();

		loginuser2();
		modifyUser2();
		logout();

		loginuser3();
		modifyUser3();
		logout();

		loginuser11();
		logout();
		loginuser22();
		logout();
		loginuser33();
		logout();

		login();
		minimizeflyoutwidnow();
		adminModifyUsers(); 
		logout();

		userLoginWithAdminPass();

		login();
		minimizeflyoutwidnow();
		deleteUser();
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
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("peter");
			oBrowser.findElement(By.name("middleName")).sendKeys("mandy");
			oBrowser.findElement(By.name("lastName")).sendKeys("peter");
			oBrowser.findElement(By.name("email")).sendKeys("peter@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("petermandy");
			oBrowser.findElement(By.name("password")).sendKeys("123456789");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("john");
			oBrowser.findElement(By.name("middleName")).sendKeys("criag");
			oBrowser.findElement(By.name("lastName")).sendKeys("kk");
			oBrowser.findElement(By.name("email")).sendKeys("john@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("johncriag");
			oBrowser.findElement(By.name("password")).sendKeys("123456789");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("max");
			oBrowser.findElement(By.name("middleName")).sendKeys("thomson");
			oBrowser.findElement(By.name("lastName")).sendKeys("aa");
			oBrowser.findElement(By.name("email")).sendKeys("max@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Max");
			oBrowser.findElement(By.name("password")).sendKeys("123456789");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginuser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("petermandy");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickclosevideo()
	{
		try
		{
			oBrowser.findElement(By.className("startExploringText")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("johncriag");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Max");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_changePassword\"]/div[1]")).click();
			oBrowser.findElement(By.id("userProfilePopup_oldPasswordField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.id("userProfilePopup_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("changePasswordTitle")).click();
			oBrowser.findElement(By.id("userProfilePopup_oldPasswordField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.id("userProfilePopup_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("changePasswordTitle")).click();
			oBrowser.findElement(By.id("userProfilePopup_oldPasswordField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\"userProfilePopup_passwordCopyField\"]")).sendKeys("987654321");
			oBrowser.findElement(By.id("userProfilePopup_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("petermandy");
			oBrowser.findElement(By.name("pwd")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("johncriag");
			oBrowser.findElement(By.name("pwd")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Max");
			oBrowser.findElement(By.name("pwd")).sendKeys("987654321");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adminModifyUsers() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456789");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456789");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456789");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).click();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void userLoginWithAdminPass()
	{
		try
		{
			//User One Login
			oBrowser.findElement(By.id("username")).sendKeys("petermandy");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

			//User Two Login
			oBrowser.findElement(By.id("username")).sendKeys("johncriag");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

			//User Three Login
			oBrowser.findElement(By.id("username")).sendKeys("Max");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456789");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);
			
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
