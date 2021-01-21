package Unit1;


import java.util.Scanner;
public class Vinay {
	 public static void main(String []args){
         int n,i,g;
        System.out.println("enter the number for multiplication tabel");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter upto what number table has to be printed");
        Scanner fc=new Scanner(System.in);
        g=fc.nextInt();
        for(i=1;i<=g;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
     }

}