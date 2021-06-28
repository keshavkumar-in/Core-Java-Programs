/*
 * Program for Multiple Class without Multiple 'main' Function
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class MultipleClassWithoutMain 
{
    public static void main(String [] args)
    {
        System.out.println("First message");
        
        First obj1=new First();
        obj1.fun();
    }
    
}
class First
{
    void fun()
    {
        System.out.println("Second Message");
    }
}


/*****OUTPUT****
 First message
Second Message
 */