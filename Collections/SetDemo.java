package Collections;

import java.util.*;
class SetDemo {
public static void main(String args[]) {
	// Create a hash set.
	Set<String> hs = new HashSet<String>();
	// Add elements to the hash set.
	hs.add("a");
	hs.add("c");
	hs.add("b");
	System.out.println(hs);
	hs.remove("c");
	
	System.out.println(hs);
	
}
}
