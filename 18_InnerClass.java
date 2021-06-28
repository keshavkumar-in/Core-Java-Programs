/*
 * Program for Inner Class 
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class InnerClass 
{
    String name="Geeky Keshav";
    void ins()
    {
        class inner
        {
            void msg()
            {
                System.out.println("name: "+name);
            }
        }
            inner obj1=new inner();
            obj1.msg();
        
    }
    public static void main(String [] args)
    {
        InnerClass obj=new InnerClass();
        obj.ins();
    }
}

/******OUTPUT****
 * name: Geeky Keshav
 */