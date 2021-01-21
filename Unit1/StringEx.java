package Unit1;
class StringEx{
	public static void main(String []args){
		String str = "Hello";
		System.out.println(str);//Hello
		String s1 = new String ("Java");
		System.out.println(s1);//Java
		char arr[] = { 'p','r','o','g','r','a','m'};
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);//p r o g r a m
		String s2 = new String (arr);
		
		System.out.println(s2);//program
		
		String s3 = new String (str);
		int[] uni_code = {71, 101, 101, 107, 115};
		String s = new String(uni_code, 1, 3);
		System.out.println(s3);
		
	}
}