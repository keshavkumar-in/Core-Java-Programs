/*
*Program to find the number of months, weeks, days, hours and seconds of number of given years.
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram4 
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        int y, m, w,d, h, s;
        System.out.print("Enter the number of years:  ");
        y=Integer.valueOf(obj.readLine()).intValue();
        System.out.println("No. of years are: "+y);
        m=Integer.parseInt(""+y*12);
        System.out.println("No. of months in these years are:  "+m);
       w=Integer.parseInt(""+y*12*4);
       System.out.println("No. of weeks in these years are: "+w);
        d=Integer.parseInt(""+y*12*4*7);
        System.out.println("No. of days in these years are: "+d);
        h=Integer.parseInt(""+y*12*4*7*24);
        System.out.println("No. of hours in these years are: "+h);
        s=Integer.parseInt(""+y*12*4*7*24*60);
        System.out.println("No. of seconds in these years are: "+s);
    }
}

/****OUTPUT****
Enter the number of years:  5
No. of years are: 5
No. of months in these years are: : 60
No. of weeks in these years are: 240
No. of days in these years are: 1680
No. of hours in these years are: 40320
No. of seconds in these years are: 2419200
 */