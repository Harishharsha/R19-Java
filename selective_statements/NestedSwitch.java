package selective_statements;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String[] args) {
		char a='A';
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1 to start execution");
		switch(s.nextInt()) {
		  case 1:
			  
			  System.out.print("Enter your choice: \n1.print Hello\n2.Print 0 to 9\n3.Print A to Z:");
			  switch(s.nextInt()){
			case 1:
				System.out.println("Hello");
				break;
			case 2:
				for(int i=0;i<10;i++)
					System.out.print(i+" ");
				break;
			case 3:
				for(int i=1;i<=26;i++) {
					System.out.print(a+" ");
					a++;
				}
				break;
			default:
				System.out.println("Invalid entry");
				break;
			  }
		  default:
				System.out.println("Invalid entry");
				break;
		}
	}

}
