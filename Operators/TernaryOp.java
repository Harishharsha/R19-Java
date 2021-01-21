package Operators;

public class TernaryOp {

	public static void main(String[] args) {
		
		int a = 20, b = 50, c = 30, result; 

		//((a>b)?(a>c)?a:c:(b>c)?b:c);
		//(a>b)?a:b;
		
	//(con)	? true :false
		
		result = ((a > b) 
					? (a > c) 
							? a 
							: c 
					: (b > c) 
							? b 
							: c);
		
		System.out.println("Max of three numbers = "
						+ result); 
	}

}

