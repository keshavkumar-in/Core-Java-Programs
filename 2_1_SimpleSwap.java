/*
 * Program for Simple Swapping using third variable.
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class SimpleSwap 
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        int c;
        
            System.out.println("Numbers for swapping: "+a +" and " +b);
        c=a;
        a=b;
        b=c;
        
            System.out.println("After swapping: "+a +" and " +b);
    }
}


/****OUTPUT****
Numbers for swapping: 10 and 20
After swapping: 20 and 10 
 */