package Unit3;


public class ArithmeticExceptionEx{  
	  public static void main(String args[]){  
	   try{  
		   
		    	String s1=null;  
				System.out.println(s1.length());//NPE
				
				String s="abc";  
				int i=Integer.parseInt(s); //NFE
				
				int a[]=new int[5];  
				a[10]=50; //AIOB
		 
	      int data=100/0;  
	   }
	   catch(ArithmeticException e){System.out.println(e);}  
	   catch(NullPointerException e){System.out.println(e);}  
	   
	   System.out.println("rest of the code...");  
	  }  
	}  