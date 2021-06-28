/*
 *Program to return object after taking value from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class ReturnObject1 
{
    int a ;
    int b;
    int c;
    
    ReturnObject1 num1 (ReturnObject1 s)
    {
        s.c=a*b;
        return s;
    }
    
    void disp()
    {
        System.out.println("Multiplication of given two Numbers is: "+c);
    }
}
class Return1
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        System.out.print("Enter first number: ");
        int a2=Integer.parseInt(obj.readLine());
        System.out.print("Enter second number: ");
        int b2=Integer.parseInt(obj.readLine());
        
        
        ReturnObject1 obj1=new ReturnObject1();
        obj1.a=a2;
        obj1.b=b2;
        
        ReturnObject1 obj2=new ReturnObject1();
        obj2=obj1.num1(obj1);
        
        obj2.disp();
        
    }
}

/*****OUTPUT****
Enter first number: 25
Enter second number: 2
Multiplication of given two Numbers is: 50
 */