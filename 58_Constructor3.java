/*
 * Program for constructor overloading
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Constructor3 
{
    int id;
    String name;
    String mob;
    Constructor3(int i,String n)
    {
        id=i;
        name=n;
    }
    
    Constructor3(int i,String n, String m )
    {
        id=i;
        name=n;
        mob=m;
    }
    void disp()
    {
        System.out.println(id+" "+name+" "+mob);
    }
    
    public static void main(String [] args)
    {
        Constructor3 obj1=new Constructor3(101,"Geeky");
        Constructor3 obj2=new Constructor3(102,"Keshav","7277674479");
        
        obj1.disp();
        obj2.disp();
    }
}

/******OUTPUT*****
101 Geeky null
102 Keshav 7277674479
 */