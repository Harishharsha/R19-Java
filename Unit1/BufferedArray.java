package Unit1;
import java.io.*;
public class BufferedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[Integer.parseInt(b.readLine())];	//int[5];
		System.out.println("Enter values:");
		for(int i=0;i<a.length;i++) {
			a[i]=Integer.parseInt(b.readLine());
			
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
