package StringHandling;

public class StringSplit{ 
    public static void main(String args[]){ 

           String s1="Maths:25 English:23 Science:22"; 
           String [] s2 = s1.split("\\s"); 
           //splits based on whitespace

            for(String word: s2){ //for each
                     System.out.println(word);
            }
     }
}