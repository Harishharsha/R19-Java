package Lab_Programs;

class Staff{
	static int id;
	static String name;
	Staff(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void show(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
	public static void main(String[] arg){
		Staff s=new Staff(1,"hai");
		s.show();
	}
}