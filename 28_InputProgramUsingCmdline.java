/*
 *Input program using command line
To run this program use cmd "java classname value1 value2"
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgramUsingCmdline 
{
    public static void main(String args[])throws IOException
    {
        String g1=args[0];
        String g2=args[1];
        
        int num1=Integer.parseInt(g1);
        int num2=Integer.parseInt(g2);
       
        System.out.println(num1+num2);
        
    }
}
