package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class First_cry_boys_fashion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(3000);
		WebElement bys = driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div/div[1]/ul/li[2]/a"));
		bys.click();
		driver.close();
	}

}
