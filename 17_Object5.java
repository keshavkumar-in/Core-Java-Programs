/*
Program on objects using functions and parameters
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Object5 
{
    int rollno;
    String name;
    
    void insert(int r, String n)
    {
        rollno=r;
        name=n;
    }
    
    void disp()
    {
        System.out.println(rollno+"  "+name);
    }
}

class teacher
{
    public static void main(String [] args)
    {
    Object5 obj1=new Object5();
    Object5 obj2=new Object5();
    
    obj1.insert(100,"Geeky Keshav");
    obj2.insert(101, "Keshav Kumar");
    
    obj1.disp();
    obj2.disp();
    }
}

/*****OUTPUT****
100  Geeky Keshav
101  Keshav Kumar
 */