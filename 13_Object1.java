/*
Simple Program using object
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Object1 
{
    int rollno;
    String name;
    
    public static void main(String ... args)
    {
        Object1 obj=new Object1();
        
        System.out.println(obj.rollno);
        System.out.println(obj.name);
    }
}

/******OUTPUT*****
0
null
* We have not assigned any value to variables 'rollno' and 'name' so we are getting the default values.
 */