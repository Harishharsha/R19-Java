package Unit4;


class Callme implements Runnable {
Thread t;
String message;
Callme(String name){
	message=name;
	t=new Thread(this);
	t.start();
}
public void run() {
	call(message);
}
	 static synchronized  void call(String msg) {
			System.out.print("[" + msg);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Interrupted");
			}
				System.out.println("]");
						
		}
		
}
class Synch {
public static void main(String args[]) {
	Callme c = new Callme("Harish");
	Callme d = new Callme("Vamsi");
	
	
	// wait for threads to end
try {
	c.t.join();
	d.t.join();
	
} catch(InterruptedException ex) {
	System.out.println("Interrupted");
}
}
}