/*
 * Program of Garbage Collection using 'Finalize()' method
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class FinalizePro 
{
    public void finalize()
    {
        System.out.println("##Garbage Cleaned##");
    }
     public static void main(String [] args)
     {
         FinalizePro obj1=new FinalizePro();
         FinalizePro obj2=new FinalizePro();
         
         obj1=null;
         obj2=null;
         
         System.gc();
     }
}

/*======OUTPUT=======
##Garbage Cleaned##
##Garbage Cleaned##
 */