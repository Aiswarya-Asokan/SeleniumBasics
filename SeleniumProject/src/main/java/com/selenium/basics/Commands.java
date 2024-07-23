package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public void webelementCommands() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com");
		WebElement register_Field=driver.findElement(By.className("ico-register"));
		register_Field.click();
	}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Commands obj=new Commands();
//obj.webelementCommands();
obj. verify_User_Registration();

	}

}
