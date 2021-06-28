/*
 * Program for Multilevel Inheritance taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Inheritance4 
{
    static int num1;
    static int num2;
    int sum;
    int sub;
    int mul;
    
    void sum()
    {
        sum=num1+num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}

class first extends Inheritance4
{
    void sub()
    {
        sub=num1-num2;
        System.out.println("Subtraction of these numbers: "+sub);
    }
}

class second extends first
{
    void mull()
    {
        mul=num1*num2;
        System.out.println("Multiplication of these numbers: "+mul);
    }
}
class third extends second
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter first number: ");
        num1=Integer.parseInt(obj.readLine());
        System.out.print("Enter second number: ");
        num2=Integer.parseInt(obj.readLine());
        
        third obj1=new third();
        
        obj1.sum();
        obj1.sub();
        obj1.mull();
               
    }
}

/******OUTPUT*****
Enter first number: 50
Enter second number: 60
Sum of these numbers: 110
Subtraction of these numbers: -10
Multiplication of these numbers: 3000
 */