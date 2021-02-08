package Collections;

import java.util.*;
class HashSetDemo {
public static void main(String args[]) {
	// Create a hash set.
	HashSet<String> hs = new HashSet<String>();
	// Add elements to the hash set.
	hs.add("b");
	hs.add("a");
	hs.add("c");
	System.out.println(hs);
	hs.remove("c");
	System.out.println(hs);
}
}
