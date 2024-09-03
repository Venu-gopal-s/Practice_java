package assignments;

public class Methodoverloading {
	
	static void add()
	{
		int a=12;
		int b=3;
		int c = a*b;
		System.out.println(c);
	}
	
	static void add(int a)
	{
		int c = a*a ;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		add(9);

	}

}
