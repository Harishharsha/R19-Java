package Unit1;

import java.util.Scanner;

class Marks{

	int id;
	float javaMarks,cMarks,cppMarks;
	public void setMarks(int id,float jm,float cm,float cpm){
		this.id=id;
		this.javaMarks=jm;
		this.cMarks=cm;
		this.cppMarks=cpm;
	}
	public void displayMarks(){
		System.out.println("Id : "+id);
		System.out.println("Java marks : "+javaMarks);
		System.out.println("C marks : "+cMarks);
		System.out.println("Cpp marks : "+cppMarks);
		
	
	}


}
class Result extends Marks{

	float avg,total;
	public void compute(){
	total=javaMarks+cMarks+cppMarks;
	avg=total/3;
	
	}
	public void showResult(){
	System.out.println("Total : "+total);
	System.out.println("Avg : "+avg);
	// display total and avg marks
	}

}
public class SingleInheritanceDemo{

   public static void main(String []args){
	int id;
	float javaMarks,cMarks,cppMarks;
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter ID:");
	
	id=s.nextInt();
	
	System.out.print("\nEnter c Marks:");
	cMarks=s.nextInt();
	System.out.print("\nEnter cpp Marks:");
	cppMarks=s.nextInt();
	System.out.print("\nEnter Java Marks:");
	javaMarks=s.nextInt();
			
			
			

		/*
	 * id=Integer.parseInt(args[0]); javaMarks=Float.parseFloat(args[1]);
	 * cMarks=Float.parseFloat(args[2]); cppMarks=Float.parseFloat(args[3]);
	 */
	Result rs=new Result();
	rs.setMarks(id,javaMarks,cMarks,cppMarks);
	rs.displayMarks();
	rs.compute();
	rs.showResult();
   
   }
}