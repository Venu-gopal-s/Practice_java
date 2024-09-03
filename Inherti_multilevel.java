package inheritence;
class Animal
{
	void eat()
	{
		System.out.println("This animal eat");
	}
}
class Mamal extends Animal 
{
	void walk() {
		System.out.println(" This mamal wals");
	}
}
 class Dog extends Mamal 
{
	void Bark()
	{
		System.out.println("This dog bites ");
	}
}
public class Inherti_multilevel {
	public static void main(String[] args) {
		 Dog d1 = new Dog();
		 d1.eat();
		 d1.walk();
		 d1.Bark();
	}
}
