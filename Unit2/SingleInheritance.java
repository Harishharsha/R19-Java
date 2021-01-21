package Unit2;

class A{
	int a,b;
	
}
class B extends A{
	
	public void set() {
	a=10; b=20;
	}
	int display() {
		return a+b;
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		B o=new B();
		o.set();
		System.out.println("Addition of a and b is: "+o.display());

	}

}
