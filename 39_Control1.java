/*
*Program for simple if statement
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Control1 
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        System.out.print("Enter your age: ");
        int a=Integer.parseInt(obj.readLine());
        
        if(a>18)
        {
            System.out.println("You are an adult.");
        }
    }
}
/*****OUTPUT****
 *If the condition is true:
 run:
Enter your age: 25              //taking input from user
You are an adult.

**If the condition is not true:
* Enter your age: 10        //taking input from user
 */