package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVAKAR\\eclipse-workspace\\SeleniumTasks\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
	
	driver.switchTo().frame("fin");
	driver.switchTo().frame("a2e");
	WebElement btnclk=driver.findElement(By.xpath("//input[@type='button']"));
	btnclk.click();
	driver.switchTo().parentFrame();  //fin
	driver.switchTo().defaultContent();  //moves to main window
	
	}

}
