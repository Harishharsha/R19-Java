package Unit1;
import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Range to print fibonnaci series: ");
		int n = s.nextInt();
		
		System.out.print("Fibonacci Series of "+n+" numbers: ");
		for(int i = 0; i < n; i++){
				System.out.print(fib(i) +" ");
			}
		}
	
	public static int fib(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fib(n-2) + fib(n-1);
		}
}
