/*
Another Program for static operation
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class StaticOperation1 
{
    int rollno;
    String name;
    
    static String college = "IGNOU";
    
    StaticOperation1()
    {
        rollno = 111;
        name = "Keshav";
    }
    void disp()
    {
        System.out.println(+rollno+ " "+name + " " +college );
    }
    
    public static void main(String [] args)
    {
        StaticOperation1 obj1=new StaticOperation1();
        StaticOperation1 obj2=new StaticOperation1();
        
        obj1.disp();
        obj2.disp();
    }
}

/*****OUTPUT****
111 Keshav IGNOU
111 Keshav IGNOU 
 */
