package Unit2;

class Animal{
	final int a=10;
	final void display() {
		System.out.println("This is Animal class");
	}
}
class Cat extends Animal{
	
	void display() {
		a=5;
		System.out.println("This is Cat class");
	}
}

public class FinalEx {

	public static void main(String[] args) {
		Cat a=new Cat();
		a.display();
		

	}

}
