package Unit1;

class MaxEx{
	public static void main(String args[]){
		MaxEx o=new MaxEx();
		System.out.println(o.max(10,20));
}
public int max(int x, int y){
	if(x>y)
		return x;
	else
		return y;
}
}