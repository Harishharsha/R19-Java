package Operators;

public class RelationalOp {

	public static void main(String[] args) {
		int a = 20, b = 10; 
		String x = "Thank", y = "Thank"; 
		int ar[] = { 1, 2, 3 }; 
		int br[] = { 1, 2, 3 }; 
		boolean condition = true; 

		
		System.out.println("a == b :" + (a == b)); //false
		System.out.println("a < b :" + (a < b)); //false
		System.out.println("a <= b :" + (a <= b)); //false
		System.out.println("a > b :" + (a > b)); //true
		System.out.println("a >= b :" + (a >= b)); //true
		System.out.println("a != b :" + (a != b)); //true

		
		System.out.println("x == y : " + (ar == br)); //false
		
		for(int i=0;i<=2;i++) {
			System.out.println(ar[i]==br[i]);
		}

		System.out.println("condition==true :"	+ (condition == true)); //true

	}

}



