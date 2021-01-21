package Operators;
import java.util.*; 
public class LogicalOp {

	public static void main(String[] args) {
		
		String x = "Harish"; 
		String y = "123"; 

		Scanner s = new Scanner(System.in); 
		System.out.print("Enter username:"); 
		String uuid = s.next(); 
		System.out.print("Enter password:"); 
		String upwd = s.next(); 

		 
		if ((uuid.equals(x) && upwd.equals(y)) 
			|| (uuid.equals(y) && upwd.equals(x))) { 
			System.out.println("Welcome "+x+"."); 
		} 
		else { 
			System.out.println("Wrong userid or password"); 
		} 
	}

}
