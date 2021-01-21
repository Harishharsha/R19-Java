package Unit1;
import java.util.*;
final class Figure{
}
class Square {
	
	public double sq(double n){
		System.out.println("Inside Area of Square");
		return n*n;
	}
}
class PreventInherit {
	public static void main(String []aa){
		double n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Square: ");
		Square s=new Square();
		n=s.sq(sc.nextDouble());
		System.out.println("Area of Square is "+n);
		
		
	}
}