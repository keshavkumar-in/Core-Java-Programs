/*
*Program for DataInputStream 
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */

public class InputProgram 
{
    public static void main(String [] args)throws Exception
    {
        int a;
        String s;
        DataInputStream obj=new DataInputStream(System.in);
        
        s=obj.readLine();
        
        a=Integer.parseInt(s);
        
        System.out.println(s);
        System.out.println(a);
    }
}

/****OUTPUT***
001709        //GIVEN INPUT
001709
1709
 */