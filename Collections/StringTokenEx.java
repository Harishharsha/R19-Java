package Collections;


/* A Java program to illustrate working of StringTokenizer 
class:*/
import java.util.*; 
public class StringTokenEx 
{ 
	public static void main(String args[]) 
	{ 
		System.out.println("Using Constructor - "); 
		StringTokenizer st1 = 	new StringTokenizer("Hi+Students+How+are+you", "i"); 
		while (st1.hasMoreTokens()) 
			System.out.println(st1.nextToken()); 

		
	} 
} 
