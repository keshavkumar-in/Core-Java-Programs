/*
 * Program for copying values without Constructor
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Constructor4 
{
    int id;
    String name;
    
    Constructor4(int i, String n)
    {
        id=i;
        name=n;
    }
    
    Constructor4()
    {
        
    }
    
    void disp()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String [] args)
    {
        Constructor4 obj1=new Constructor4(101,"Geeky");
        Constructor4 obj2=new Constructor4();
        
        obj2.id=obj1.id;
        obj2.name=obj1.name;
        
        obj1.disp();
        obj2.disp();
    }
}

/******OUTPUT****
101 Geeky
101 Geeky
 */