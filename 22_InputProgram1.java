/*
*Program for taking input using DataInputStream and Integer.valueOf method
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram1 
{
    public static void main(String ... args)throws Exception
    {
        int a;
        
        DataInputStream obj=new DataInputStream(System.in);
        
        a=Integer.valueOf(obj.readLine()).intValue();
        
        System.out.println("Given Input Data is: "+a);
    }
}

/****OUTPUT****
1709   //Given Input
Given Input Data is: 1709
 */