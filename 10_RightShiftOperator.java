/*
**Program of >> and >>> Shift operator
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class RightShiftOperator 
{
    public static void main(String ... args)
    {
        //For positive number, >> and >>> works same
        System.out.println(10>>2);
        System.out.println(10>>>2);
        
        //For Negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-10>>2);
        System.out.println(-10>>>2);
    }
}

/****OUTPUT*****
2
2
-3
1073741821
 */
