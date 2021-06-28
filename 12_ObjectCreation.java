/*
 *WAP to Display Object Creation
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class ObjectCreation 
{
    public static void main(String [] args)
    {
        System.out.println("This is my First Message.");
        ObjectCreation  obj1=new ObjectCreation(); 
        /**Explanation of above line**
        *'ObjectCreation' is the class name in which object is created.
        * 'obj1' is the object name.
        * 'new' is a java keyword to create objects.
        * 'ObjectCreation()' is known as constructor.
        */
        obj1.show(); //Method calling
        obj1.show1();
    }
    
    public void show()
    {
        System.out.println("This is the 2nd Message called through an object 'obj1' with function 'show'.");
    }
    
    public void show1()
    {
        System.out.println("This is the 3rd Message called through the same object 'obj1' but with another method/function 'show1'.");
    }
}



/**********OUTPUT*********
This is my First Message.
This is the 2nd Message called through an object 'obj1' with function 'show'.
This is the 3rd Message called through the same object 'obj1' but with another method/function 'show1'.
 */