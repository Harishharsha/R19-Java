package Unit2;
class Channel{
	String name="Telugu Tech Academy";
}
class Learner extends Channel{
	String name="Harish";
	void display(){
		System.out.println(super.name);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Learner o=new Learner();
		o.display();
		
	}

}
