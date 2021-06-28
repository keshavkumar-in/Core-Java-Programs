/*
* Program on Method Overloading passing value through parameters
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class MethodOverloading 
{
    int Area(int i)
    {
        return i*i;
    }
    int Area(int a, int b)
    {
        return (a*b);
    }
}
class Method
{
    public static void main(String [] args)
    {
        MethodOverloading obj=new MethodOverloading();
        int area=obj.Area(25);
        System.out.println("Square of the given number is: "+area);
        
        area=obj.Area(25, 10);
        System.out.println("Multiplication of the given Numbers is: "+area);
    }
}

/*****OUTPUT****
 * run:
Square of the given number is: 625
Multiplication of the given Numbers is: 250
 */