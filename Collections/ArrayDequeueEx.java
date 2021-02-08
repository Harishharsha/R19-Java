package Collections;

import java.util.*;
class ArrayDequeueEx {
public static void main(String args[]) {
// Create an array deque.
ArrayDeque<String> adq = new ArrayDeque<String>();
// Use an ArrayDeque like a stack.
adq.push("A");
adq.push("B");
adq.push("D");
adq.push("F");
System.out.print("Popping the stack: ");
while(adq.peek() != null)
	System.out.print(adq.pop() + " ");
System.out.println();
}
}