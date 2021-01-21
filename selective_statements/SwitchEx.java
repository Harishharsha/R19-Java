package selective_statements;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		char a='A'; //65
		char x='a'; //97
		System.out.print("Enter your choice: \n1.print Hello\n2.Print 0 to 9\n3.Print A to Z:\n 4.Print a to z:");
		Scanner s=new Scanner(System.in);
		
		switch(s.nextInt()) {
			case 1:
				System.out.println("Hello");
				break;
			case 2:
				for(int i=0;i<10;i++)
					System.out.print(i+" ");//0 1 2 3 4 5 
				break;
			case 3:
				for(int i=1;i<=26;i++) {
					System.out.print(a+" ");//A B C D 
					a++;
				}
				break;
			case 4:
				for(int i=1;i<=26;i++) {
					System.out.print(x+" ");//A B C D 
					x++;
				}
				break;
			default:
				System.out.println("Invalid entry");
				break;
		}
	}

}
