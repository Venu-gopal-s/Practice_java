package testngnew;

import org.testng.annotations.Test;

public class InvocationCounts {
@Test(invocationCount = 4)
public void Login()
{
	System.out.println("logged in successfully ");
}

}
