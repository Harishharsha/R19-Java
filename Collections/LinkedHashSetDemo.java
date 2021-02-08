package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		// Create a hash set.
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		// Add elements to the hash set.
		hs.add("Rajesh");
		hs.add("Ravi");
		hs.add("Vamsi");
		System.out.println(hs);
	}
}
