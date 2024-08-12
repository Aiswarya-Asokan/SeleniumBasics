package testNg_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class Commands extends Base{
@Test
	public void verify_UserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailfield=driver.findElement(By.className("email"));
		String expected="helloo123@gmail.com";
		emailfield.sendKeys(expected);
		WebElement pswdfield=driver.findElement(By.className("password"));
		pswdfield.sendKeys("hello@123");
		WebElement loginfield=driver.findElement(By.xpath("//input[@value='Log in']"));
		loginfield.click();
		WebElement mail=driver.findElement(By.xpath("//a[text()='helloo123@gmail.com']"));
		String actual=mail.getText();
		Assert.assertEquals(actual,expected,"Invalid Login");
	}
		public void verify_title()
		{
			driver.get("https://demowebshop.tricentis.com/");
			String title=driver.getTitle();
			String exptitle="Demo Web Shop";
			Assert.assertEquals(title, exptitle,"Invalid Title");
		}

		@Test	
public void verify_register_page()
{
	driver.get("https://demowebshop.tricentis.com/register");
	WebElement gender_field=driver.findElement(By.id("gender-female"));
	gender_field.click();
	WebElement firstname=driver.findElement(By.id("FirstName"));
	firstname.sendKeys("Aiswarya");
	WebElement lastname=driver.findElement(By.id("LastName"));
	lastname.sendKeys("Asokan");
	WebElement email=driver.findElement(By.id("Email"));
	email.sendKeys("helloo1234@gmail.com");
	WebElement password=driver.findElement(By.id("Password"));
	password.sendKeys("hello@1234");
	WebElement cnfrmpassword=driver.findElement(By.id("ConfirmPassword"));
	cnfrmpassword.sendKeys("hello@1234");
	WebElement register=driver.findElement(By.id("register-button"));
	register.click();
	WebElement registersuccess=driver.findElement(By.className("result"));
	String actualresult=registersuccess.getText();
	String expectedresult="Your registration completed";
	Assert.assertEquals(actualresult, expectedresult,"Registration not success");
	
}
		@Test
		public void verify_isselected()
		{
			
			driver.get("https://demowebshop.tricentis.com/register");
			WebElement gender1_Field=driver.findElement(By.id("gender-female"));
		 boolean  isButtonSelected=gender1_Field.isSelected();
			Assert.assertFalse(isButtonSelected, "Button is not selected");
			gender1_Field.click();
		boolean	isButtonSelected1=gender1_Field.isSelected();
		Assert.assertTrue(isButtonSelected1, "Button is selected");
		}
		@Test
		public void verify_isenabled()
		{
			
			driver.get("https://demowebshop.tricentis.com");
			WebElement subscriptionfield=driver.findElement(By.id("newsletter-subscribe-button"));
			boolean isSubscriptionEnabled=subscriptionfield.isEnabled();
			Assert.assertTrue(isSubscriptionEnabled, "Enabled");
		}	
		@Test
		public void verify_isDisplayed()
		{
			
			
			driver.get("https://demowebshop.tricentis.com");
			WebElement subfield=driver.findElement(By.id("newsletter-subscribe-button"));
		boolean issub=subfield.isDisplayed();
		Assert.assertTrue(issub, "Displayed");
			}
}
