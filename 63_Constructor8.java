/*
* Program for copying value with constructor taking input from user 
*/
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Constructor8 
{
        static int num1;
        static int num2;
        int add;
        Constructor8(int n1, int n2)
        {
            num1=n1;
            num2=n2;
        }
        Constructor8()
        {
            
        }
        
        void disp()
        {
            add=num1+num2;
            System.out.println("Addition of these numbers is: "+add);
        }
        
        public static void main(String [] args)throws Exception
        {
            DataInputStream obj=new DataInputStream(System.in);
            
            System.out.print("Enter first number: ");
            num1=Integer.parseInt(obj.readLine());
            System.out.print("Enter second number: ");
            num2=Integer.parseInt(obj.readLine());
            
            Constructor8 obj1=new Constructor8(num1,num2);
            Constructor8 obj2=new Constructor8();
            
            obj2.num1=obj1.num1;
            obj2.num2=obj1.num2;
            
            obj1.disp();
            obj2.disp();
        }
}

/*******OUTPUT*******
Enter first number: 25
Enter second number: 25
Addition of these numbers is: 50
Addition of these numbers is: 50
 */