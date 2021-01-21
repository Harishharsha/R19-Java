package Unit2;
interface A1{
	static int a=10,b=20;
}
interface B1 extends A1{
	public void mul();
}
interface C1 extends A1{
	public void sum();
}


public class HybridInheritance implements C1,B1{

	public static void main(String[] args) {
		HybridInheritance o=new HybridInheritance();
		o.sum();
		o.mul();

	}
	public void mul() {
		System.out.println(a*b);
	}
	public void sum() {
		System.out.println(a+b);
	}

}
