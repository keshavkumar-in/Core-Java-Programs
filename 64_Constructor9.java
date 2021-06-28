/*
 * Program for copying values without Constructor taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Constructor9 
{
    static int num1;
    static int num2;
    int total;
    
    Constructor9(int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }
    
    Constructor9(Constructor9 s)
    {
        num1=s.num1;
        num2=s.num2;
    }
    
    void disp()
    {
        total=num1+num2;
        System.out.println("Sum of these numbers: "+total);
    }
    
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter first number: ");
        num1=Integer.parseInt(obj.readLine());
        System.out.print("Enter second number: ");
        num2=Integer.parseInt(obj.readLine());
        
        Constructor9 obj1=new Constructor9(num1,num2);
        Constructor9 obj2=new Constructor9(obj1);
        
        obj1.disp();
        obj2.disp();
    }
}

/******OUTPUT*****
Enter first number: 25
Enter second number: 30
Sum of these numbers: 55
Sum of these numbers: 55
 */