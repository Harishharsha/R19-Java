package Unit4;

public class ThreadEx2 implements Runnable{
	public static void main(String[] args) {
		ThreadEx2 o=new ThreadEx2();
		Thread t=new Thread(o);
		t.start();
	}
	public void run() {
		System.out.println("This is Runnable Thread example");
	}
}
