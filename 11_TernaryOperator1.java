/*
Another program for ternary operator
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class TernaryOperator1 
{
    public static void main(String [] args)
    {
        float a =15.05f;
        int b=10;
        
        float min=(a<b)?a:b;
        //int min=(a<b)?a:b;        //Compile error
        System.out.println("Minimum number is: "+ min);
    }
}

/****OUTPUT****
 * Minimum number is: 10.0
 */