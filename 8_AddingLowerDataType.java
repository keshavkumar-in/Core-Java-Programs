/*
Program for adding lower data type
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class AddingLowerDataType 
{
    public static void main(String [] args)
    {
        byte a= 20;
        byte b= 30;
        /*byte c=a+b; 
        * will produce compile error because a+b=50 will be integer at dynamic time hence typecasting is necessary.
        */     
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}

/******OUTPUT*****
 50
 */