/*
*Program for taking input through "Scanner"
 */
package javaprograms;
import java.util.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram7 
{
   public static void main(String ... args) 
   {
       Scanner obj=new Scanner(System.in);
       
       int a=obj.nextInt();
       float b=obj.nextFloat();
       String s=obj.next();
       double g=obj.nextDouble();
       long h =obj.nextLong();
       
       System.out.println("All value entered Successfully!!");
   }
}

/*****OUTPUT*****
25
36
98
78
95223
All value entered Successfully!!
 */