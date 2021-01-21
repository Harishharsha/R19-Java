package selective_statements;

public class IfElseIf {

	public static void main(String[] args) {
		int a=50,b=20,c=30;
		if(a>b & a>c)
			System.out.print(a+" is big");
		else if(b>a & b>c)
			System.out.print(b+" is big");
		else
			System.out.print(c+" is big");
			

	}

}
