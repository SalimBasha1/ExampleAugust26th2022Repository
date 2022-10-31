package Com.sgtesting.test.Assignments;
import org.openqa.selenium.By;
//4. launchBrowser --> navigate --> Login --> Create Customer --> delete Customer --> Logout --> CloseApplication
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static WebDriver oBroswer=null;

	public static void main(String[] args)
	{
		launchBrowser();
		naivagate();
		login();
		Windowslayoff();
		CreateCustomer();
		deleteCustomer();
		createProject();
//		logout();
//		closeapplication();
	}
	private static void launchBrowser() 
	{
		try
		{

			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Driver\\chromedriver.exe" );
			//Thread.sleep(5000);
			oBroswer = new ChromeDriver();


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void naivagate()
	{
		try
		{
			oBroswer.get("http://localhost:8080/login.do");
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login() 
	{

		try
		{
			oBroswer.findElement(By.id("username")).sendKeys("admin");
			oBroswer.findElement(By.name("pwd")).sendKeys("manager");
			oBroswer.findElement(By.xpath("//*[@id='loginButton']/div")).click();


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Windowslayoff()
	{
		try
		{

			oBroswer.findElement(By.className("gettingStartedShortcutsLabel")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CreateCustomer()
	{

		try
		{

			oBroswer.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			oBroswer.findElement(By.xpath("//div[text()='Add New']")).click();
			oBroswer.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(5000);
			oBroswer.findElement(By.id("customerLightBox_nameField")).sendKeys("Alex");
			oBroswer.findElement(By.id("customerLightBox_descriptionField")).sendKeys("The following projetc on the Agile procee");
			oBroswer.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{

		try
		{
			oBroswer.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(3000);
			oBroswer.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			oBroswer.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBroswer.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();


		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	private static void createProject()
	{
		try
		{

			oBroswer.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			oBroswer.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBroswer.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			
			oBroswer.findElement(By.xpath("//*[@id=\"projectPopup_projectNameField\"]")).sendKeys("E-Commerece");
			oBroswer.findElement(By.id("ext-gen68")).click();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{

		try
		{
			oBroswer.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
	private static void closeapplication()
	{

		try
		{
			oBroswer.quit();

		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}
