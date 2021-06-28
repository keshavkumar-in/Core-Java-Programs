/*
 * Program of returning object 
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class ReturnObject 
{
    int ro;
    int ba;
    
   ReturnObject(int r, int b)
   {
       ro=r;
       ba=b;
   }
   ReturnObject num (ReturnObject s)
   {
       s.ro=ro*200/10;
       return s;
   }
}
class Return
{
    public static void main(String [] args)
    {
        ReturnObject obj1=new ReturnObject(50,10);
        ReturnObject obj2;
        obj2=obj1.num(obj1);
        
        System.out.println("Returned value: "+obj2.ro);
    }
}

/******OUTPUT***
 * Returned value: 1000
 */