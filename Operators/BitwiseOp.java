package Operators;

public class BitwiseOp {

	public static void main(String[] args) {
				int a = 5; 		 //0101
				int b = 7;	     //0111
				//AND 11 1 10 01 00 0
				//OR 01 10 11 1 00 0
				//EXOR 11 00 0 10 01 1
				
				System.out.println("a&b = " + (a & b)); //1001 0111 0001 1
				System.out.println("a|b = " + (a | b));// 1001 0111 1111 15
				System.out.println("a^b = " + (a ^ b)); // 1110 14
				System.out.println("~a = " + ~a); // 0101  1010 0101 0110 -6
				a &= b; 
				System.out.println("a= " + a);//1
	}

}

