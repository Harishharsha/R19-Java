package Unit1;
import java.util.Scanner;
public class ArrayEx {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		//int n=s.nextInt();     01234
		int a[]=new int[s.nextInt()];	
		System.out.println("Enter values:");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
