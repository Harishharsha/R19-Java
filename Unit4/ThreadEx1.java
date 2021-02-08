package Unit4;

public class ThreadEx1 extends Thread{
	public static void main(String [] arg) {
		ThreadEx1 t=new ThreadEx1();
		t.start();
	}
	public void run() {
		System.out.println("This is Extending Thread example");
	}
}
