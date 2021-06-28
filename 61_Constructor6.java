/*
 * Program for parameterised constructor taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Constructor6 
{
    static int id;                      //variable should be declared as static to use it in 'main method'
    static String name;
    Constructor6 (int i,String n)
    {
             id=i;   
             name=n;
    }
    
    void disp()
    {
        System.out.println("Roll no. "+ id+","+" Name: "+name);
        System.out.println("++++++++++++++++++++");
    }
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter Roll no.: ");
       id=Integer.parseInt(obj.readLine());
       System.out.print("Enter name: ");
       name=obj.readLine();
        Constructor6 obj1=new Constructor6(id,name);     //directly enter the variable name in the parameter section
        obj1.disp();
        
        System.out.println("=====================");
        System.out.print("Enter Roll no.: ");
       id=Integer.parseInt(obj.readLine());
       System.out.print("Enter name: ");
       name=obj.readLine();
        Constructor6 obj2=new Constructor6(id,name);     
        obj2.disp();
    }
}

/********OUTPUT******
Enter Roll no.: 1
Enter name: Geeky
Roll no. 1, Name: Geeky
++++++++++++++++++++
=====================
Enter Roll no.: 2
Enter name: Keshav
Roll no. 2, Name: Keshav
++++++++++++++++++++
 */