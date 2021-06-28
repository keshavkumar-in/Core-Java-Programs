/*
 * Program of Single Inheritance taking static value
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Inheritance1 
{
    static int num1;
    static int num2;
    int total;
    int mull;
    
    void disp()
    {
        total=num1+num2;
        System.out.println("Sum of these numbers: "+total);
        System.out.println("************************");
    }
}
class child extends Inheritance1
{
        //num1=30;              //Cannot assign value here because variable is defined in parent class
        //num2=30;  
    void mul()
    {
        mull=num1*num2;
        System.out.println("Multiplication of these numbers: "+mull);
    }
    
    public static void main(String [] args)
    {
        //Cannot assign value in the main method, if the variable is non-static
        num1=30;
        num2=30;
        
        Inheritance1 obj=new Inheritance1();
        obj.disp();
        //obj.mul();              //We cannot use child class method using parent class object
        child obj1=new child();
        obj1.disp();
        obj1.mul();
    }
}

/*******OUTPUT******
Sum of these numbers: 60
************************
Sum of these numbers: 60
************************
Multiplication of these numbers: 900
*/