/*
Program of Unary Operator 
*Pre- Increment
**Post-Increment
***Pre-Decrement
****Post- Decrement
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class UnaryOperator 
{
    public static void main(String ... args)
    {
        int a= 100;
        System.out.println(a++);    //Post increment
        System.out.println(++a);    //Pre increment
        System.out.println(a--);    //Post decrement
        System.out.println(--a);    //Pre decrement
    }
}

/****OUTPUT****
100
102
102
100
 */