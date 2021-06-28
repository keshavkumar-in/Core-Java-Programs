/*
 * Program of constructor overloading taking input from user
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class Constructor7 
{
    static int roll;
    static String name;
    static String mob;
    
    Constructor7(int r,String n,String m)
    {
        roll=r;
        name=n;
        mob=m;
    }
    
    Constructor7(int r,String n)
    {
        roll=r;
        name=n;
    }
    
    void disp()
    {
        System.out.println("Roll no.: "+roll+", "+"Name: "+name);
        System.out.println("*********************");
    }
    void disp1()
    {
        System.out.println("Roll no.: "+roll+", "+"Name: "+name+", "+"Mob: "+mob);
    }
    
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
        
        System.out.print("Enter Roll no.: ");
        roll=Integer.parseInt(obj.readLine());
        System.out.print("Enter Name: ");
        name=obj.readLine();
        
        Constructor7 obj1=new Constructor7(roll,name);
        obj1.disp();
        
        System.out.println("******************");
        System.out.print("Enter Roll no.: ");
        roll=Integer.parseInt(obj.readLine());
        System.out.print("Enter Name: ");
        name=obj.readLine();
        System.out.print("Enter Mobile no.: ");
        mob=obj.readLine();
        
         Constructor7 obj2=new Constructor7(roll,name,mob);
        obj2.disp1();
    }
}

/*********OUTPUT*******
 * run:
Enter Roll no.: 1
Enter Name: Geeky
Roll no.: 1, Name: Geeky
*********************
******************
Enter Roll no.: 2
Enter Name: Keshav
Enter Mobile no.: 7277674479
Roll no.: 2, Name: Keshav, Mob: 7277674479
*/