package testngnew;

import org.testng.annotations.Test;

public class Testngpriority {
@Test(priority = 1)
public void Login()
{
	System.out.println("priority 1");
}
@Test
public void registration()
{
	System.out.println("priority default 0");
}
@Test (priority = -1)
public void browser()
{
	System.out.println("browser -1");
}
}
