package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomateFirstcry {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("GIRL FASHION")).click();
		driver.close();
		}

}
