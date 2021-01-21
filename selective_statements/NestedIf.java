package selective_statements;

public class NestedIf {

	public static void main(String[] args) {
		int a=10,b=50,c=69;
		if(a>b) {
			if(a>c)
				System.out.print(a+" is big");	
		}			
		else if(b>a & b>c)
			System.out.print(b+" is big");
		else
			System.out.print(c+" is big");
	}

}
