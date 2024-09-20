package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testempty {
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.close();
    
	}

}
