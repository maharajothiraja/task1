 package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Check {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Textdebugcontains\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement cou = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(cou).perform();
		WebElement orc = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(orc).perform();
		WebElement dba = driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		dba.click();
	}

}
