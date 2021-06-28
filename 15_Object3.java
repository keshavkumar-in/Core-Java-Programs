/*
Simple program on object
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Object3 
{
    int rollno;
    String name;
}

class student1
{
    public static void main(String[] args)
    {
        Object3 obj=new Object3();
        obj.rollno=100;
        obj.name="Keshav";
        
        System.out.println("Roll no.: "+ obj.rollno +","+ " Name: "+obj.name);
        
    }
}

/*****OUTPUT****
 *Roll no.: 100, Name: Keshav
 */