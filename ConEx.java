
public class ConEx {
	ConEx d;
	String name="Harish";
	ConEx(ConEx o){
		this.d=o;
		System.out.println("HI I m "+d.name);
	}
	ConEx(){
		
	}
	public static void main(String[] args) {
		ConEx c=new ConEx();
		ConEx c1=new ConEx(c);

	}

}
