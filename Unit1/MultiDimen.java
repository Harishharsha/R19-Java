package Unit1;
import java.io.*;
import java.util.Scanner;
class MultiDimen{
	public static void main(String args[])//throws IOException
	{
		int m=2,n=2,i,j;
		/*
		 * int m,n,i,j;
		 * 
		 * m=Integer.parseInt(args[0]); n=Integer.parseInt(args[1]);
		 */
		int arr[][]=new int[m][n];
		//int arr[][]=new int[][]{{2,2},{3,4}};
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);
		for(i=0;i<m;i++)
			for(j=0;j<n;j++){
				
				//arr[i][j]=Integer.parseInt(br.readLine());
				arr[i][j]=s.nextInt();//00 01 10 11
			}	
			
		for(i=0;i<m;i++)
		{for(j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");// 00 01 \n 10 11
			}	
			System.out.println("");
		}
			
		
	}
}