/*
Another program for data overflow 
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class DataOverflow1 
{
    public static void main(String ... args)
    {
        float a= 3000.67f;
        int b= (int)a;
        
        System.out.println(a);
        System.out.println(b);
     }
}


/******OUTPUT******
 3000.67
3000
 */