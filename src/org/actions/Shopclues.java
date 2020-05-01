package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Actions\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement mob = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[22]"));
Actions a=new Actions(driver);
a.moveToElement(mob).perform();
WebElement range = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
range.click();
}
}	
