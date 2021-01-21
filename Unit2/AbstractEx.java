package Unit2;
abstract class Bike{
	
	abstract void display();
}
class Hero extends Bike{
	
	void display() {
		System.out.println("Hero Splendor +");
	}
}
class Honda extends Bike{
	void display() {
		System.out.println("Honda Shine");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		Hero o=new Hero();
		o.display();
		Bike b=new Honda();
		b.display();
	}

}
