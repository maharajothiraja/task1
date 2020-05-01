package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\mjraja\\Actions\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    	Actions a=new Actions(driver);
		a.dragAndDrop(bank, dest).perform();
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(src1, dest1);
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		a.dragAndDrop(src2, dest2).perform();
		WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(src3, dest3).perform();

}

}
