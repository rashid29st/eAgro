package eAgro01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void home(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://118.67.220.50/unifiedeagro");
		
		//User Name + Password
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("AusTin4#");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[3]/label/input")).click();
		
		//Recover Password
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[3]/a")).click();
		//driver.findElement(By.id("email")).sendKeys("gisb_sqa@grameen-intel.com");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/form/div[2]/a/span")).click();
		
		//Login Button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		
		//Dashboard/index/Logout
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/a[2]")).click();
		
		
		//User Name + Password
		driver.findElement(By.id("userName")).sendKeys("gisb_sqa@grameen-intel.com");
		driver.findElement(By.id("password")).sendKeys("AusTin4#");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[3]/label/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[4]/button")).click();
		
		driver.findElement(By.xpath("")).click();
		
		
		
		
		
		//driver.close();
	}

}
