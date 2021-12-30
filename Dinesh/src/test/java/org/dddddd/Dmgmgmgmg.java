package org.dddddd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dmgmgmgmg {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tamilmatrimony.com/");
		WebElement btnlogin = driver.findElement(By.id("open_loginpp"));
		btnlogin.click();
		WebElement txtname = driver.findElement(By.id("ID"));
		txtname.sendKeys("M7444408");
		WebElement pass = driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','test4bm')", pass);
		WebElement btnlodin = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		btnlodin.click();
		try{
			WebElement close1 = driver.findElement(By.xpath("//a[@style='color: #ed6402;text-decoration: none;']"));
		
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",close1);
			
		}
		catch(Exception e){
			System.out.println("no popup");
		} 

		try{
			WebElement horoscopeClose = driver.findElement(By.xpath("//img[@title='Close']"));
		
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();",horoscopeClose);
			
		}
		catch(Exception e){
			System.out.println("no horoscope popup");
		}

		try{
			WebElement close2 = driver.findElement(By.xpath("//a[@onclick='FF']"));
			
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", close2);
			
		}
		catch(Exception e){
			System.out.println("no 2nd popup");
		}


        WebElement profile = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul[1]/li[2]/a"));
        JavascriptExecutor executor11 = (JavascriptExecutor)driver;
		executor11.executeScript("arguments[0].click();", profile);
         driver.findElement(By.xpath("//*[@id='clustercaste_option_id_2']")).click();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='selected_parent_box3']/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='COUNTRY_INinner_option_id_1']")).click();
//         driver.findElement(By.xpath("//*[@id='selected_parent_box7']/div[1]")).click();
//         driver.findElement(By.xpath("//*[@id='STATE_INinner_option_id_12']")).click();
         driver.findElement(By.xpath("//*[@id='PHOTO_OPT']")).click();
         driver.findElement(By.xpath("//*[@id='ACTIVE_OPT']")).click();
         driver.findElement(By.xpath("//*[@id='Form']/form/div[1]/dl[9]/dd/label[4]")).click();
         driver.findElement(By.xpath("//*[@id='Form']/form/dl/dd/span/input")).click();

	}
}

