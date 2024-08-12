package automationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
public void intialise_browse(String browserName)
{
	if(browserName.equals("Chrome"))
			{
		driver=new ChromeDriver();
		
			}
	else if(browserName.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browserName.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		throw new RuntimeException("Invalid Browser Received");
	}
	driver.manage().window().maximize();
}
@BeforeMethod
	public void setup()
	{
		intialise_browse("Chrome");
	}
@AfterMethod
	public void close_Browser()
	{
	//	driver.close();
	}
}

