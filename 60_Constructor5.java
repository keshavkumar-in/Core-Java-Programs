/*
 * Program for copying values with constructor
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Constructor5 
{
   int id;
   String name;
   
   Constructor5(int i, String n)
   {
       id=i;
       name=n;
   }
   
   Constructor5(Constructor5 s)
   {
       id=s.id;
       name=s.name;
   }
   
   void disp()
   {
       System.out.println(id +"  "+name);
   }
   
   public static void main(String [] args)
   {
       Constructor5 obj1=new Constructor5(100,"Geeky");
       Constructor5 obj2=new Constructor5(obj1);
       
       obj1.disp();
       obj2.disp();
   }
}

/*******OUTPUT*****
100  Geeky
100  Geeky
 */