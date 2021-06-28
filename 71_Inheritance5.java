/*
 * Program for Hirerchical Inheritance using static value
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Inheritance5 
{
    static int num1;
    static int num2;
    int sum;
    int sub;
    int mull;
    
   void sum()
    {
        sum=num1+num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}

class fst extends Inheritance5
{
    void sub()
    {
        sub=num1-num2;
        System.out.println("Subtraction of these numbers: "+sub);
    }
}

class scnd extends Inheritance5
{
    void mul()
    {
        mull=num1*num2;
        System.out.println("Multiplication of these numbers: "+mull);
    }
}
class thd extends Inheritance5
{
    public static void main(String [] args)
    {
        num1=25;
        num2=30;
        
        thd obj=new thd();
        obj.sum();
        fst obj1=new fst();
        obj1.sub();
        scnd obj2=new scnd();
        obj2.mul();
    }
}

/********OUTPUT******
Sum of these numbers: 55
Subtraction of these numbers: -5
Multiplication of these numbers: 750
 */