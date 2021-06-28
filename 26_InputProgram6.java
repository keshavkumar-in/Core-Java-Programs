/*
 * Program of input from InputStreamReader

When we 
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram6 
{
   public static void main(String [] args)throws Exception
   {
      InputStreamReader obj=new InputStreamReader(System.in);
       BufferedReader obj1=new BufferedReader(obj);
       int a;
       int b;
       int c;
       int d;
       System.out.print("Enter a number:  ");
       a=Integer.parseInt(obj1.readLine());
       System.out.print("Enter 2nd number: ");
       b=Integer.parseInt(obj1.readLine());
       System.out.print("Enter 3rd number: ");
       c=Integer.parseInt(obj1.readLine());
       d=(a+b+c);
       System.out.println("Sum of all these numbers is: "+d);
       
   }
}
/*****OUTPUT****
Enter a number:  25
Enter 2nd number: 36
Enter 3rd number: 45
Sum of all these numbers is: 106
 */