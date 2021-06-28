/*
 * Program of Nested Class
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class NestedClass 
{
   static String name="Geeky"; //Variable must be assigned as 'static'
    /*void displ()
   {
       System.out.println("Hello");
       
   }*/
    static class name1
    {
        void msg()
        {
            System.out.println("Data is: "+name);
        }
        void disp()
        {
           name1 obj1=new name1();
           obj1.msg();
           //obj1.displ();    //Cannot call outer class method in inner class
        } 
    
         public static void main(String args[])
        {
          name1 obj=new name1();
            //NestedClass obj=new NestedClass();  // Cannot Create object using outer class in inner class
           obj.disp();
           //obj.displ();  // Cannot connect to outer class method
        }
    }  
}

/*****OUTPUT*****
 * Data is: Geeky
 */