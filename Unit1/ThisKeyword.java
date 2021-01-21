package Unit1;

public class ThisKeyword {
	int a,b;
	public static void main(String[] arg) {
		ThisKeyword o=new ThisKeyword();
		o.sample(5,10);
		o.display();
	}
	
	public void display() {
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		
	}

	public void sample(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
}
