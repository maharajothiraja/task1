package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Actions\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		WebElement creat = driver.findElement(By.xpath("(//a[@target='_self'])[4]"));
		creat.click();
		WebElement enter = driver.findElement(By.xpath("(//a[@target='_self'])[10]"));
		enter.click();
}
}