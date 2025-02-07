package testngnew;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testngannotations {
	@Test
	public void test()
	{
		System.out.println("@test");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("@before suite");
	}
	@AfterSuite
	public void as()
	{
	System.out.println("@after suite ");	
	}	
	@BeforeTest
	public void BT()
	{
		System.out.println("@before test");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("@after test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("@before class");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("@after class ");
	}
	@BeforeMethod
	public void main()
	{
		System.out.println("@before method");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("@after method ");
	}
}
