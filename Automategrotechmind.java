package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Automategrotechmind {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.id("fname"));
		fn.sendKeys("venu");
		Thread.sleep(2000);
		WebElement Ln = driver.findElement(By.id("lname"));
		Ln.sendKeys("s");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("venu.play@gmail.com");
		Thread.sleep(2000);
		WebElement pswrd = driver.findElement(By.id("password"));
		pswrd.sendKeys("venu.play@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		WebElement skills = driver.findElement(By.id("Skills"));
		skills.sendKeys("Technical Skills");
		Thread.sleep(2000);
		WebElement tecskill = driver.findElement(By.id("technicalskills"));
		tecskill.sendKeys("Selenium");
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.id("Country"));
		country.sendKeys("India");
		Thread.sleep(2000);
		WebElement presentadress = driver.findElement(By.id("Present-Address"));
		presentadress.sendKeys("# Door 1234 , testing house , nelamangala");
		Thread.sleep(2000);
		WebElement permadress = driver.findElement(By.id("Permanent-Address"));
		permadress.sendKeys("# Door 1234 , testing house , nelamangala");
		Thread.sleep(2000);
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("562123");
		Thread.sleep(2000);
		WebElement region = driver.findElement(By.id("Relegion"));
		region.sendKeys("Hindu");
		Thread.sleep(2000);
		driver.findElement(By.id("relocate")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		//Thread.sleep(2000);
		//driver.close();
		}

}
