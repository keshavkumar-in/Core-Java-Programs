/*
* Program for Nested if-else
*/
package javaprograms;
import java.util.*;
/**
 *
 * @author Geeky Keshav
 */
public class Control3
{
    public static void main(String args[])
    {
        int rollno;
        String name;
        float perc;
        int s[]=new int [5];
        int total=0;   
        
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter name of the Student: ");
        name=obj.next();
        System.out.print("Enter roll no.: ");
        rollno=obj.nextInt();
        System.out.println("Enter Marks of 5 subjects: ");
        
        for(int i=0;i<s.length;i++)
        {
           int b=obj.nextInt();
           s[i]=b;
           total=total+s[i];
        }
        
          perc=(total/5);
          
          System.out.println("Name of the Student: "+name);
          System.out.println("Roll no. of the Student: "+rollno);
          System.out.println("Total marks: "+total);
          System.out.println("Percentage: "+perc);
          
          if (perc>=50 && perc<60)
          {
              System.out.println("Grade: D");
          }
          else if (perc>=60 && perc<70)
          {
              System.out.println("Grade: C");
          }
          else if (perc>=70 && perc<80)
          {
              System.out.println("Grade: B");
          }
          else if (perc>=80 && perc<90)
          {
              System.out.println("Grade: A");
          }
          else if (perc>=90 && perc<100)
          {
              System.out.println("Grade: A+");
          }
          else
          {
              System.out.println("Grade: Fail");
          }
    }
}

/****OUTPUT****
run:
Enter name of the Student: keshav
Enter roll no.: 1
Enter Marks of 5 subjects: 
96
50
80
75
95
Name of the Student: keshav
Roll no. of the Student: 1
Total marks: 396
Percentage: 79.0
Grade: B
 */