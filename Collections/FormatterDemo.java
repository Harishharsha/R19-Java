package Collections;
import java.util.*;
public class FormatterDemo {
	public static void main(String args[]) 
    { 
  
        // create Formatter class object 
        Formatter formatter = new Formatter(); 
  
        // Use Space format specifier 
        formatter.format("%d", -111); 
        System.out.println(formatter); 
  
        formatter = new Formatter(); 
        formatter.format("%+d", 111); 
        System.out.println(formatter);
        
        formatter = new Formatter();
        formatter.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
        System.out.println(formatter);
        
        Formatter fmt = new Formatter();
        for(double i=1.23; i < 1.0e+6; i *= 100) {
        fmt.format("%f %e", i, i);
        System.out.println(fmt);
        }
        fmt.close();
        
        formatter=new Formatter();
        formatter.format("%a", 512.0);
        
        fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
     // Display standard 12-hour time format.
     fmt.format("%tr", cal);
     System.out.println(fmt);
     fmt.close();
     // Display complete time and date information.
     fmt = new Formatter();
     fmt.format("%tc", cal);
     System.out.println(fmt);
     fmt.close();
     // Display just hour and minute.
     fmt = new Formatter();
     fmt.format("%tl:%tM", cal, cal);
     System.out.println(fmt);
     fmt.close();
     // Display month by name and number.
     fmt = new Formatter();
     fmt.format("%tB %tb %tm", cal, cal, cal);
     System.out.println(fmt);
     fmt.close();
     
     fmt = new Formatter();
     fmt.format("Copying file%nTransfer is %d%% complete", 88);
     System.out.println(fmt);
     fmt.close();
    } 
}
