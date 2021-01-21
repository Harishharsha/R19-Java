package Operators;

public class BitData {

	public static void main(String[] args) {
		long n=1,i=1;
		System.out.println(i+" - "+n);
		for(i=2;i<=32;i++) {
			n+=n;
			System.out.println(i+" - "+n);
		}

	}
	//0000 0000 0000 0000 0000 0000 0000 0000
	

}
