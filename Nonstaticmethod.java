package assignments;

public class Nonstaticmethod {
	
	void add()
	{
		int a = 10 ;
		int b = 20 ;
		int sum = a + b ;
		System.out.println(sum);
	}
	void mul()
	{
		int a = 10 ;
		int b = 20 ;
		int m = a * b ;
		
		System.out.println(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstaticmethod n1 = new Nonstaticmethod();
		n1.add();
		n1.mul();

	}

}
