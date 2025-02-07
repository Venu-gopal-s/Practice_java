package testngnew;// click on g-mail link 

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Secondtest  extends LaunchQuit{
@Test
public void testcase2()
{
	driver.findElement(By.linkText("Gmail")).click();
	
}
}
