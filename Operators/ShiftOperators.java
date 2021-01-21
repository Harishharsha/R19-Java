package Operators;

public class ShiftOperators {
	public static void main(String[] args) 
	{ 

		int a = 10;                   //                  0000 1010     0010 1000
		int b = -8; 
		//Left shift
		//Right shift
		//Right shift with zero fill
		
		System.out.println("a<<2 = " + (a << 2)); //0000 1010 0001 0100 0010 1000  40 
		System.out.println("a>>2 = " + (a >> 2)); //1010 0101 0010 2
		System.out.println("b>>>2 = " + (b >>> 1)); //0111 1111 1111 1111 1111 1111 1111 1100 2147483644  
	} 
}
