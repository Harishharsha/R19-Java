package StringHandling;


public class StrCompare{ 
    public static void main(String args[]){ 
    String s1="string"; 
    String s2="string"; 
    String s3="ring"; 
    String s4="swing"; 

    System.out.println(s1.compareTo(s2));
    //0 because both are equal 

    System.out.println(s1.compareTo(s3));
    //1 because "s" is 1x greater than "r"

    System.out.println(s1.compareTo(s4)); 
    // -3 because "t" is 3x lower than "w"
    }
}