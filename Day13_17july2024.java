package inh;// single level inheritance 
class Amazon{										//parent not present in package explorer 
	static void Login_un()
	{
		System.out.println("valid user name ");
	}
}
public class Day13_17july2024 extends Amazon{				// child // present in package explorer //subclass
	static void Login_pwd() {
		System.out.println("password is valid ");
	}

	public static void main(String[] args) {					//main method 
		// TODO Auto-generated method stub
		Login_un();
		Login_pwd();
		}

}
