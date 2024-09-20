package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintoamazon {
	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.linkText("Sign in")).click();
WebElement emailid = driver.findElement(By.name("email"));
emailid.sendKeys("9980527998");
Thread.sleep(2000);
driver.findElement(By.id("continue")).click();
WebElement pswrd = driver.findElement(By.name("password"));
pswrd.sendKeys("Venu****27");
Thread.sleep(2000);
driver.findElement(By.id("auth-signin-button")).click();
//Thread.sleep(2000);
//driver.close();
}
}
