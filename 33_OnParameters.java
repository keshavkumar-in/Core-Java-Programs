/*
Program for member variable intialization through parameters
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class OnParameters 
{
   int rollno;
   String name;
   String mobno;
   
   void insert(int r, String n, String m)
   {
       rollno=r;
       name=n;
       mobno=m;
   }
   
   void disp()
   {
       System.out.println(rollno+"  "+ name+"  "+mobno);
   }
}

class studentrec
{
    public static void main(String [] args)
    {
        OnParameters obj1=new OnParameters();
        OnParameters obj2=new OnParameters();
        OnParameters obj3=new OnParameters();
        
        obj1.insert(100, "Geeky", "7301690712");
        obj2.insert(101,"Keshav","7277674479");
        obj3.insert(102, "Geeky Keshav","7301690712");
        
        obj1.disp();
        obj2.disp();
        obj3.disp();
    }
}

/*****OUTPUT****
100  Geeky  7301690712
101  Keshav  7277674479
102  Geeky Keshav  7301690712
 */