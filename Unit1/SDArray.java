package Unit1;
import java.util.Scanner;
import java.io.*;
class SDArray
{
	public static void main (String args[]) throws IOException
	{ //Create a BufferedReader class object (br)
		//5 1 2 3 4 6
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of an array");
		//br.readLine();
		//int n=Integer.parseInt(br.readLine());
		//int v[]=new int[size];
		//int v[]={1,2,3};
		
		//int a[]=new int[n];
		int a[]=new int[5];
		
		System.out.println("Enter elements to array");
		
		for(int i=0;i<n;i++) //5 0<5 5
			a[i]=Integer.parseInt(br.readLine()); //
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		
	}
}