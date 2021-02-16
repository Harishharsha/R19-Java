package Unit3;

class Test<T> 
{ 
    // An object of type T is declared 
    T obj; 
    Test(T obj) {
    	this.obj = obj;  }  // constructor 
    public T getObject()  { 
    	return this.obj; }
    
} 
   
// Driver class to test above 
class GenEx 
{ 
    public static void main (String[] args) 
    { 
        // instance of Integer type 
        Test <Integer> iObj = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Test <String> sObj = 
                          new Test<String>("SVCEIT"); 
        System.out.println(sObj.getObject()); 
        Test <Double> sObj1 =	new Test<Double>(5.0); 
        System.out.println(sObj1.getObject()); 
    } 
}