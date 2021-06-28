/*
Program for Data Overflow
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class DataOverflow 
{
    public static void main (String [] args)
    {
        int a= 150;
        byte b = (byte)a;
        
        System.out.println(a);
        System.out.println(b);
    }
}

/****OUTPUT*****
150
-106
 */