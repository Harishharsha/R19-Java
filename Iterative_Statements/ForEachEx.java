package Iterative_Statements;

public class ForEachEx {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int n:x)
			sum+=n;//sum=sum+n;
		System.out.println(sum);//1+2+3+4+5+6+7+8+9+10=55

	}

}
