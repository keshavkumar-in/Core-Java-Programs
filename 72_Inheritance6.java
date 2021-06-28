/*
 * Program for Hirerchical Inheritance using static value
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Inheritance6
{
    static int num1;
    static int num2;
    int sum;
    int sub;
    int mull;
    
   void sum()
    {
        sum=num1+num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}

class fst1 extends Inheritance6
{
    void sub()
    {
        sub=num1-num2;
        System.out.println("Subtraction of these numbers: "+sub);
    }
}

class scnd1 extends Inheritance6
{
    void mul()
    {
        mull=num1*num2;
        System.out.println("Multiplication of these numbers: "+mull);
    }
}
class thd1 extends Inheritance6
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter first number: ");
        num1=Integer.parseInt(obj.readLine());
        System.out.print("Enter second number: ");
        num2=Integer.parseInt(obj.readLine());
        
        thd1 obj1=new thd1();
        obj1.sum();
        fst1 obj2=new fst1();
        obj2.sub();
        scnd1 obj3=new scnd1();
        obj3.mul();
    }
}

/********OUTPUT******
Enter first number: 30
Enter second number: 25
Sum of these numbers: 55
Subtraction of these numbers: 5
Multiplication of these numbers: 750
 */