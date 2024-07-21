package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();//browser launch
driver.manage().window().maximize(); //command to maximize the window
driver.get("https://github.com/Aiswarya-Asokan/SeleniumBasics"); //url up
String title =driver.getTitle(); //to print title of web page
System.out.println("Title is "+ title);
String currenturl=driver.getCurrentUrl(); // to print url of up webpage
System.out.println("Current url is "+currenturl);
String handleid =driver.getWindowHandle(); //to get handle id of current webpage
System.out.println("Handle id is "+handleid);
String pagesource=driver.getPageSource(); //to get source code of current webpage
System.out.println("Pagesource is "+pagesource);
driver.close(); //to automatically close the window
	}

}
