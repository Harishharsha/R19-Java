package Unit1;

public class Method {
	static String colname="";
	public static void main(String []arg) {
		Method obj=new Method();
		obj.setDisplay("svce");
		obj.display();
	}
	public void setDisplay(String a) {
		colname=a;
	}
	
	public void display() {
		System.out.print(colname);
	}


}