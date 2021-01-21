package Unit2;

/*
 * interface A1{ static int a=10,b=20; public void add(); } interface B1{ static
 * int x=20,y=20; public void mul(); }
 * 
 * 
 * public class MultipleInheritance implements A1,B1{
 * 
 * public static void main(String[] args) { MultipleInheritance o =new
 * MultipleInheritance(); o.add(); o.mul();
 * 
 * 
 * } public void add() { System.out.println("sum of a and b is"+(a+b)); } public
 * void mul() { System.out.println("Multiplication of x and y is"+(x*y)); }
 * 
 * 
 * }
 */
interface A1{
	static int a=10,b=20;
	default  void add() {
		System.out.println("sum of a and b is"+(a+b));
	}
}
interface B1{
	static int x=20,y=20;
	default  void mul() {
		System.out.println("Multiplication of x and y is"+(x*y));
	}

}


public class MultipleInheritance  implements A1,B1{

	public static void main(String[] args) {
		MultipleInheritance o =new MultipleInheritance();
		
		o.mul();
		o.add();

	}
	
		

}
