/*
 * Create Multiple Class with Multiple 'Main' Function
* 'main' function always contains 'static' keyword
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class MultipleClass 
{
       public static void main(String[] args)
       {
           System.out.println("This is the First class with 'main' function.");
       }
}
   class Second
       {
           public static void main(String [] args)
           {
               System.out.println("This the Second Class with 'main' function.");
           }
       }
   class Third
   {
       public static void main(String [] args)
       {
           System.out.println("This is the third class.");
       }
   }


/******OUTPUT******
 * Each class will run separately because each class contains 'main' function.
 */

