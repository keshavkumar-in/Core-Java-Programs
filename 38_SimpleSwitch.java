/*
 * Simple Switch Case Program
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class SimpleSwitch 
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        String s;
        s=obj.readLine();
        int a=Integer.parseInt(s);
        String msg;
        switch(a)
                {
                    case 1:
                               msg="This is number 1";
                               break;
                     
                    case 2:
                               msg="This is number 2";
                                   break;
                    default:
                        msg="no suitable numbers";
                }
        System.out.println(msg);
       
    }
}

/****OUTPUT****
**When given input is: 
* 1
This is number 1
* When given input is:
* 12
*no suitable numbers
 */