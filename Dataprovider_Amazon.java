package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Amazon {

	@DataProvider(name="data1")
	public Object [][] method()
	{
		return new Object [][] {{"shoes"},{"mobiles"},{"earphones"},{"T shirt"},{"mouse"}};
	}
	
	@Test(dataProvider = "data1")
	public void Amzsearch(String input)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input+Keys.ENTER);
		driver.quit();
	}
}
