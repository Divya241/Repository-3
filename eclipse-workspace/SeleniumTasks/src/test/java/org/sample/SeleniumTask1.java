package org.sample;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVAKAR\\eclipse-workspace\\SeleniumTasks\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> numOfCheckbox=driver.findElements(By.className("checkbox"));
	System.out.println(numOfCheckbox.size());
	List<WebElement> numOfTxtfield=driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println(numOfTxtfield.size());
	List<WebElement> numOfRadiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(numOfRadiobutton.size());
	List<WebElement> numOfButtons=driver.findElements(By.tagName("button"));
	System.out.println(numOfButtons.size());
	
	
	
	}

}
