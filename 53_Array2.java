/*
 * Program of array by taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Array2 
{
   
   public static void main(String [] args)throws Exception
   {
       int a[]=new int[4];
       DataInputStream obj=new DataInputStream(System.in);
       for(int i=0;i<=3;i++)
       {
           System.out.println("Enter number: ");
           int b=Integer.parseInt(obj.readLine());
           a[i]=b;
       }
      for(int i=0;i<=3;i++)
      {
          System.out.println("Output: "+a[i]);
      }
   }
}

/*****OUTPUT****
Enter number: 
2
Enter number: 
3
Enter number: 
4
Enter number: 
5
Output: 2
Output: 3
Output: 4
Output: 5
 */