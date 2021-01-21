package Operators;
import java.util.Scanner;
public class Arithmetic {

	static int a=10,b=10,c=0,ch=0,n;
	public static void main(String[] args) {
		do {
		System.out.println("Enter your Choice\n 1. Add 2.Sub 3.Mul 4.Div 5.Modulo Div 6.Increment 7.Decrement");
		//c=Integer.parseInt(args[0]);
		Scanner s=new Scanner(System.in);
		c=s.nextInt();
		
			switch(c) {
		case 1:
			System.out.println(a+b);
			
			break;
		case 2:
			System.out.println(a-b);
			
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
		case 6:
			System.out.println(++a);
			System.out.println(b++);
			break;
		case 7:
			System.out.println(--b);
			System.out.println(a--);
		default:
			System.out.println("Enter Valid Choice");
		}
			System.out.println("Do you want to continue?\npress 1 to continue");
			n=s.nextInt();
			if(n==1)
				ch=1;
			else
				ch=0;
		}while(ch==1);

	}

}
