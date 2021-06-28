/*
Program on objects
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Object4 
{
    int rollno;
    String name;
}

class student2
{
    public static void main(String[] args)
    {
        Object4 obj1=new Object4();
        Object4 obj2=new Object4();
        
        obj1.rollno=100;
        obj1.name="Geeky";
        obj2.rollno=101;
        obj2.name="Keshav";
        
        System.out.println(obj1.rollno+"  "+obj1.name);
        System.out.println(obj2.rollno+"  "+obj2.name);
    }
}

/****OUTPUT****
100  Geeky
101  Keshav
 */