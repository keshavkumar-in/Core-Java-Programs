/*
Program of DataInputStream on float data type
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram2 
{
    public static void main(String...args)throws IOException
    {
        int a;
        int b;
        int c;
        DataInputStream obj=new DataInputStream(System.in);
        System.out.print("Enter first no.: ");
        a=Integer.valueOf(obj.readLine()).intValue();
        System.out.print("Enter Second no.:  ");
        b=Integer.valueOf(obj.readLine()).intValue();
        
        c=(a+b);
        
        System.out.println("Sum of these Numbers is:  "+c);
    }
}

/****OUTPUT****
Enter first no.: 25
Enter Second no.:  26
Sum of these Numbers is:  51
 */