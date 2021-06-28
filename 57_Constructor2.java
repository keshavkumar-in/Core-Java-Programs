/*
 * Program for parameterised constructor
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Constructor2 
{
    int id;
    String name;
    
    Constructor2(int i, String n)
    {
        id=i;
        name=n;
    }
    
    void disp()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String [] args)
    {
        Constructor2 obj1=new Constructor2(100,"Geeky");
        Constructor2 obj2=new Constructor2(101,"keshav");
        
        obj1.disp();
        obj2.disp();
    }
}

/*****OUTPUT*****
100 Geeky
101 keshav
 */