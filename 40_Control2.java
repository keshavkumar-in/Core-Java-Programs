/*
* Program for simple if-else statement
 */
package javaprograms;
import java.util.*;
/**
 *
 * @author Geeky Keshav
 */
public class Control2 
{
    public static void main(String [] args)throws Exception
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        
        if(a%2==0)
        {
            System.out.println("Given number is Even.");
        }
        else
        {
            System.out.println("Given number is odd.");
        }
    }
}

/******OUTPUT****
 * If the statement is true:
 Enter a number: 30                 //given data
Given number is Even.
* 
* *If the Condition is false: 
Enter a number: 15              //given data
Given number is odd.
 */