/*
Simple Program using object
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Object2 
{
    int rollno;
    String name;
}

class student
{
    public static void main(String ...args)
    {
        Object2 obj=new Object2();
        /*
        *student obj=new student();
        *System.out.println(obj.rollno);
        *the variable 'rollno' is declared in class 'Object2', that's why we can't use it in another class 
        */
        System.out.println(obj.rollno);
        System.out.println(obj.name);
    }
}

/******OUTPUT*****
0
null
* We have not assigned any value to variables 'rollno' and 'name' so we are getting the default values.
 */