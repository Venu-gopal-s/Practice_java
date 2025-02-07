package selennium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fblgn {
	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("fb@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("********");
			driver.findElement(By.name("login")).click();
			
			
	}

}
