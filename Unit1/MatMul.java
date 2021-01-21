package Unit1;
import java.util.Scanner;
public class MatMul {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r1,c1,r2,c2,i,j,k;
		System.out.println("Enter matrix 1 rows and columns size");
		r1=s.nextInt();
		c1=s.nextInt();
		int m[][]=new int[r1][c1];
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
				m[i][j]=s.nextInt();
		System.out.println("Enter matrix 2 rows and columns size");
		r2=s.nextInt();
		c2=s.nextInt();
		int n[][]=new int[r2][c2];
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
				n[i][j]=s.nextInt();
		
		if(c1==r2)
		{
			int res[][]=new int[r1][r1];
			for(i=0;i<r1;i++) {
				for(j=0;j<r1;j++) {
					res[i][j]=0;
					for(k=0;k<c1;k++) {
						res[i][j]+=m[i][k]*n[k][j];
					}
					System.out.print(res[i][j]+"  ");
				}
				System.out.println("");
			}
		}else
			System.out.println("Matrix multiplication is not possible");
	}

}
