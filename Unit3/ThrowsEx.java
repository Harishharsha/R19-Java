package Unit3;
import java.io.*;
public class ThrowsEx {
	 void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   ThrowsEx obj=new ThrowsEx();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
}
