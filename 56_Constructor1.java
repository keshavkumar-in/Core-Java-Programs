/*
* Program for default constructor
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Constructor1 
{
    int id;
    String name;
    
    void disp()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String [] args)
    {
        Constructor1 obj1=new Constructor1();
        Constructor1 obj2=new Constructor1();
        
        obj1.disp();
        obj2.disp();
    }
}

/******OUTPUT*****
0 null
0 null
 */