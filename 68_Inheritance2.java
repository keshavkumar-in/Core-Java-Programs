/*
 * Program of Single Inheritance taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Inheritance2 
{
    static int num1;
    static int num2;
    int total;
    int mull;
    void disp()
    {
        total=num1+num2;
        System.out.println("Sum of these numbers: "+total);
    }
}
class child1 extends Inheritance2
{
    void mul()
    {
        mull=num1*num2;
        System.out.println("Multiplication of these numbers: "+mull);
    }
    
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj1=new DataInputStream(System.in);
        System.out.print("Enter first number: ");
        num1=Integer.parseInt(obj1.readLine());
        System.out.print("Enter second number: ");
        num2=Integer.parseInt(obj1.readLine());
        
        child1 obj=new child1();
        obj.disp();
        obj.mul();
        
    }
}

/*********OUTPUT********
Enter first number: 50
Enter second number: 30
Sum of these numbers: 80
Multiplication of these numbers: 1500
 */