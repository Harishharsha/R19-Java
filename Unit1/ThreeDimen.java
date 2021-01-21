package Unit1;
import java.util.Scanner;
import java.io.*;
class ThreeDimen{
	public static void main(String args[])throws IOException{
		//int m=2,n=2,o=2,i,j,k;
		/*int arr[][][]=new int[][][]
		{{{1,2},{3,4}},{{5,6},{7,8}}};*/
		int m,n,o,i,j,k;
		
		/*
		 * m=Integer.parseInt(args[0]); n=Integer.parseInt(args[1]);
		 * o=Integer.parseInt(args[2]);
		 */
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		o=s.nextInt();
		int arr[][][]=new int[m][n][o];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				for(k=0;k<o;k++){
					arr[i][j][k]=Integer.parseInt(br.readLine());
			}	
			
		for(i=0;i<m;i++)
			for(j=0;j<n;j++){
				for(k=0;k<o;k++){
				System.out.print(arr[i][j][k]+" ");
			}	
			System.out.println("");
		}
			
		
	}
}