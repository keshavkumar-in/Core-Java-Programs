/**DATA WIDENING PROGRAM**
 * Data widening is used to convert smaller data type to larger data type.
 *Program to convert a integer data type value into float data type
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
*/
public class DataWidening 
{
    public static void main(String [] args)
    {
        int a = 120;
        float b = a;
        
        System.out.println(a);
        System.out.println(b);
    }
}


/******OUTPUT*****
120
120.0
*/