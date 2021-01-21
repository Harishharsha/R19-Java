package Unit1;

public class GarbageCEx {
int i=10,j=20;
	public static void main(String[] args) {
		GarbageCEx g=new GarbageCEx();
		GarbageCEx g1=new GarbageCEx();
		g=null;
		//g1=null;
		g=g1; //Assigning Reference
	new GarbageCEx();
		System.gc();

	}
	public void finalize() {
		System.out.println("Garbage Collector Called hi");
	}

}
