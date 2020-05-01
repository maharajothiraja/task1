package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Actions\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mob = driver.findElement(By.xpath("(//img[@alt='Vivo U10'])"));
		mob.click();
WebElement acce = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[3]"));
Actions a=new Actions(driver);
a.moveToElement(acce).perform();
//WebElement het = driver.findElement(By.xpath("(//a[text()='Headsets'])"));
//a.moveToElement(het).perform();
//het.click();
	}

}
