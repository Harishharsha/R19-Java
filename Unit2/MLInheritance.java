package Unit2;

class ClassA{
	int m,n;
	
}
class ClassB extends ClassA{
	void set() {
	m=60; n=20;
	}
	
}
class ClassC extends ClassB{
	int display() {
		return m+n;
	}
}

public class MLInheritance {

	public static void main(String[] args) {
		ClassC o=new ClassC();
		o.set();
		System.out.println("Addition of a and b is: "+o.display());
	}

}
