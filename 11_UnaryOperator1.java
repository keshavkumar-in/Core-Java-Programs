/*
Program for adding two variables using unary operator
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class UnaryOperator1 
{
   public static void main(String ... args)
   {
        int a=10;
        int b=20;
    
        System.out.println(a++ + ++b);    
        System.out.println(a++ + ++b);
   }
}

/*****OUTPUT*****
31
33
 */