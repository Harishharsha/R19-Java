package Unit4;


class PriorityT implements Runnable{
	Thread t;
	PriorityT(String name) {
	// Create a new, second thread
	t = new Thread(this, name);
	System.out.println( t.getName()+" Started");
	t.start(); // Start the thread
	}
	// This is the entry point for the second thread.
	public void run() {
	try {
		/*for(int i = 5; i > 0; i--) {
	System.out.println("Child Thread: " + i);
	Thread.sleep(1000);
	}*/
	} catch (Exception e) {	System.out.println("Child interrupted.");
	}
	
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		
		PriorityT p=new PriorityT("one");
		PriorityT p1=new PriorityT("two");
		p.t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(p.t.getPriority());
	}
}