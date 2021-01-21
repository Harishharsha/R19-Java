package Unit2;

class Animal{
	void display() {
		System.out.println("This is Animal class");
	}
}
class Cat extends Animal{
	void display() {
		System.out.println("This is Cat class");
	}
}
class Dog extends Animal{
	void display() {
		System.out.println("This is Dog class");
	}
}

public class Dispatch {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.display();
		Animal b=new Dog();
		b.display();
		Animal c=new Animal();
		c.display();
		

	}

}
