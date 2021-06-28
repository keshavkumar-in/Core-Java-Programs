/*
Program for ternary operator
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class TernaryOperator 
{
    public static void main(String [] args)
    {
        int a =5;
        int b=10;
        int max=(a>b)?a:b;
        
        System.out.println("Maximum number is: "+ max);
    }
}

/****OUTPUT****
Maximum number is: 10
 */