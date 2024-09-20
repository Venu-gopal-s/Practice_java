package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintofacebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement emailid = driver.findElement(By.name("email"));
		emailid.sendKeys("9980527998");
		Thread.sleep(2000);
		WebElement pswrd = driver.findElement(By.name("pass"));
		pswrd.sendKeys("98802*****");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}

}
