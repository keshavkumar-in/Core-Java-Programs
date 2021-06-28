/*
*Program to convert the given temperature in degree celcius to Farenhite and Kelvin
**Formulae:
Kelvin = 273.15 + celcius;
Farenhite = (1.8*celcius)+32;
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class InputProgram3 
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        float c,f;
        double k;
        System.out.print("Enter the temperature in Celcius:  ");
        c=Float.valueOf(obj.readLine()).floatValue();
        f=((c*9)/5)+32;
        System.out.println("Value of given temp in Farenhite is: " +f);
        k=(273.15+c);
        System.out.println("Value of given temp in Kelvin is: "+k);
    }
}

/****OUTPUT****
 Enter the temperature in Celcius:  35
Value of given temp in Farenhite is: 95.0
Value of given temp in Kelvin is: 308.15 
 */