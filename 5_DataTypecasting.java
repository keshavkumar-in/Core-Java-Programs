/****DATA TYPECASTING PROGRAM****
 * Data typecasting is used to convert larger data type to smaller data type.
 * Program to convert float data type into integer data type
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class DataTypecasting 
{
    public static void main(String [] args)
    {
        float a =120.5f;
        //int b = a;              //possible loosy conversion from float to int error
        int b =(int) a; 
        
        System.out.println(a);
        System.out.println(b);
    }
}

/*******OUTPUT*****
120.5
120
 */