/*
* Program on Method Overloading taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class MethodOverloading1 
{
    int a,b,i;
    int Area(int c)
    {
        i=c;
        int g=i*i;
        return (g);
    }
    int Area(int d, int e)
    {
        a=d;
        b=e;
        int f=a*b;
        return (f);
    }
}
class Method1
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter a number: ");
        int a1=Integer.parseInt(obj.readLine());
        MethodOverloading1 obj1=new MethodOverloading1();
        obj1.Area(a1);
        int area=obj1.Area(a1);
        System.out.println("Square of the given value is:"+area);
        System.out.println("**************************");
        System.out.println("**************************");
        
        /****************************************************/
        
        System.out.print("Enter first number: ");
        a1=Integer.parseInt(obj.readLine());
        System.out.print("Enter second number: ");
        int a2 = Integer.parseInt(obj.readLine());
        MethodOverloading1 obj2=new MethodOverloading1();
       area= obj2.Area(a1, a2);
        System.out.println("Multiplication of the given Numbers is: "+area);
    }
}

/*****OUTPUT****
 * run:
Enter a number: 5
Square of the given value is:25
**************************
**************************
Enter first number: 56
Enter second number: 1
Multiplication of the given Numbers is: 56
 */