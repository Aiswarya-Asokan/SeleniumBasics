package com.selenium.basics1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Commands_Main {

	public void webelementCommands() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com");
		WebElement register_Field=driver.findElement(By.className("ico-register"));
		register_Field.click();
	}
	
	//user registration in demowebshop site
	
	public void verify_User_Registration()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_Field=driver.findElement(By.id("gender-female"));
		gender_Field.click();
		WebElement firstName_Field=driver.findElement(By.id("FirstName"));
		firstName_Field.sendKeys("Aiswarya");
		WebElement lastName_Field=driver.findElement(By.id("LastName"));
		lastName_Field.sendKeys("Asokan");
		WebElement email_Field=driver.findElement(By.id("Email"));
		email_Field.sendKeys("aiswaryaasokan@gmail.com");
		WebElement password_Field=driver.findElement(By.id("Password"));
		password_Field.sendKeys("aiswarya1234");
		WebElement confirmpassword_Field=driver.findElement(By.id("ConfirmPassword"));
		confirmpassword_Field.sendKeys("aiswarya1234");
		WebElement register_Field=driver.findElement(By.id("register-button"));
		register_Field.click();
		

	}
	
	
	// to check whether a radio button or check box is selected or not
	public void verify_isselected()
	{
		boolean isButtonSelected;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender1_Field=driver.findElement(By.id("gender-female"));
	   isButtonSelected=gender1_Field.isSelected();
		System.out.println("Gender button before selected :"+isButtonSelected);
		gender1_Field.click();
		isButtonSelected=gender1_Field.isSelected();
		System.out.println("Gender button after selected :"+isButtonSelected);
		driver.close();
	}
	
	//to find out whether an element is enabled on the web page (in the current browsing context) or not
	public void verify_isenabled()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com");
		WebElement subscriptionfield=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean isSubscriptionEnabled=subscriptionfield.isEnabled();
		System.out.println("Subscription button is enabled : "+ isSubscriptionEnabled);
		driver.close();
	}
	
	
	/* used to check whether the element is visible or not on the web page.
	It returns a boolean value true if the element is visible and false in either case.*/
	public void verifyisdisplayed()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		WebElement sub_button=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean issubbuttondisplayed=sub_button.isDisplayed();
		System.out.println("subscribe element is displayed: "+issubbuttondisplayed);
		driver.close();
	}
	
	
	//to select a value from dropdown list
	public void verifyValuesFromDropDown()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryfield=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryfield);
		select.selectByVisibleText("ARUBA");
	}
	
	
	
	//to get size of a dropdown list
	public void getTotalDropdownValues()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement countryfield=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countryfield);
		List<WebElement> dropdownlist=select.getOptions();
		System.out.println(dropdownlist.size());
driver.close();
		
	}
	
	//to right click 
	public void verifyrightclick()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action=new Actions(driver);
		action.contextClick(right_click).build().perform();
		//driver.close();
	}
	
	
	public void verifymouseover()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/menu/");
	WebElement mainitem2_field=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	Actions action=new Actions(driver);
	action.moveToElement(mainitem2_field).build().perform();
	driver.close();
	}
	
	//drag and drop
	public void verifydrag_and_drop()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement dragfield=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropfield=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragfield, dropfield).build().perform();
		
	}
	public void verify_drag_and_drop_using_offset()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement dragmefield=driver.findElement(By.id("dragBox"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(dragmefield, 150,100).build().perform();
		driver.close();
	}
	
	public void verifykeyboardevent() throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		driver.close();
		}

	public void verifysimplealert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement simpleclick=driver.findElement(By.id("alertButton"));
		simpleclick.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyconfirmalert()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement confirmclick=driver.findElement(By.id("confirmButton"));
		confirmclick.click();
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println("Alert message is "+message);
		alert.accept();
		WebElement confirmresult=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String result=confirmresult.getText();
		System.out.println("Confirmation result message is : "+result);
			}
	
	
	public static void main(String args[]) throws AWTException
	{
		Commands_Main obj=new Commands_Main();
		//obj.webelementCommands() ;
		//obj.verify_User_Registration();
		//obj.verify_isselected();
		//obj.verify_isenabled();
		//obj.verifyisdisplayed();
		//obj.verifyValuesFromDropDown();
		//obj.getTotalDropdownValues();
		//obj.verifyrightclick();
		//obj.verifymouseover();
		//obj.verifydrag_and_drop();
		//obj.verify_drag_and_drop_using_offset();
		//obj.verifykeyboardevent();
		//obj.verifysimplealert();
		obj.verifyconfirmalert();
	}
	}


