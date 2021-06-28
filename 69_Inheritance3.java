/*
 * Program for Multilevel Inheritance using static value
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Inheritance3 
{
    static int num1;
    static int num2;
    int sum;
    int sub;
    int mull;
    
    void sum()
    {
        sum=num1+num1;
        System.out.println("Sum of these numbers: "+sum);
    }
}
 class child2 extends Inheritance3
 {
     void sub()
     {
         sub=num1-num2;
         System.out.println("Subtraction of these numbers: "+sub);
     }
 }
class child3 extends child2
{
    void mul()
    {
        mull=num1*num2;
        System.out.println("Multiplication of these numbers: "+mull);
    }
}
class child4 extends child3
{
    public static void main(String [] args)
    {
        num1=30;
        num2=25;
        
        child4 obj=new child4();
        obj.sum();
        obj.sub();
        obj.mul();
    }
}

/********OUTPUT******
Sum of these numbers: 60
Subtraction of these numbers: 5
Multiplication of these numbers: 750
 */