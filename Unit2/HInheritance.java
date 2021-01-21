package Unit2;

class one 
{ 
    public void print_hi() 
    { 
        System.out.println("Hi"); 
    } 
} 
  
class two extends one 
{ 
    public void print_hello() 
    { 
        System.out.println("Hello"); 
    } 
} 
  
class three extends one 
{ 
    /*............*/
} 
  


public class HInheritance {

	public static void main(String[] args) {
		 three g = new three(); 
	        g.print_hi(); 
	        two t = new two(); 
	        t.print_hello(); 
	        t.print_hi(); 
		
	}

}
