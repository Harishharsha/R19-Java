package Operators;

public class AssignmentOp {

	public static void main(String[] args) {
		int a = 20, b = 10, c, d, e = 10, f = 4, g = 9; 
		  
         
        c = b;//10 
        System.out.println("Value of c = " + c); 
        a = a + 1; //21
        b = b - 1; //9
        e = e * 2; //20
        f = f / 2; //2
        System.out.println("a, b, e, f = " + a + ", " + b + ", " + e + ", " + f);//21 9 20 2 
        a = a - 1; //20
        b = b + 1; //10
        
        e = e / 2;//10 
        f = f * 2; //4
        
        a += 1; //21
        b -= 1; //9
        e *= 2; //20
        f /= 2; //2
        System.out.println("a, b, e, f (using shorthand operators)= " + a + ", " + b + ", " + e + ", " + f); 

	}

}
