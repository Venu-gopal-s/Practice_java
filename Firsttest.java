package testngnew;// type india and enter button

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Firsttest extends LaunchQuit {
@Test
public void testcase1()
{
	driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
}
	
}
