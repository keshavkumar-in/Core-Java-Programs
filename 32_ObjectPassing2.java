/*
 * Program on object passing taking input from user
*******NOT POSSIBLE*******
Cannot copy one object to another
 */
package javaprograms;
import java.io.*;
/**
 *
 * @author Geeky Keshav
 */
public class ObjectPassing2
{
    String name;
    int rollno;
    float perc;
    String grade;
   
    void disp()
    {
        System.out.println("***********************");
        System.out.println("Student name: "+name);
        System.out.println("Student Roll no.: "+rollno);
        System.out.println("Student's Percentage: "+perc);
        System.out.println("Student's Grade: "+grade);
        System.out.println("***********************");
    }
}
class std_marks2
{
    public static void main(String [] args)throws Exception
    {
        DataInputStream obj=new DataInputStream(System.in);
       
        System.out.print("Enter name of the Student: ");
        String n=obj.readLine();
        System.out.print("Enter Roll No.: ");
        int r=Integer.parseInt(obj.readLine());
        System.out.print("Enter Percentage of the Student: ");
        float p=Float.parseFloat(obj.readLine());
        
        ObjectPassing2 obj1=new ObjectPassing2(); 
        obj1.name=n;
        obj1.rollno=r;
        obj1.perc=p;
        
        std_grade(obj1);
        obj1.disp();
        
        System.out.println("***********************");
        System.out.print("Enter name of the Student: ");
        n=obj.readLine();
        System.out.print("Enter Roll No.: ");
        r=Integer.parseInt(obj.readLine());
        System.out.print("Enter Percentage of the Student: ");
        p=Float.parseFloat(obj.readLine());
        
        ObjectPassing2 obj2=new ObjectPassing2();
        obj2=obj1;
        std_grade(obj2);
        obj2.disp();
        
        System.out.println("***********************");
        System.out.print("Enter name of the Student: ");
        n=obj.readLine();
        System.out.print("Enter Roll No.: ");
        r=Integer.parseInt(obj.readLine());
        System.out.print("Enter Percentage of the Student: ");
        p=Float.parseFloat(obj.readLine());
        
        ObjectPassing2 obj3=new ObjectPassing2();
        obj3=obj1;
        std_grade(obj3);
        obj3.disp();         
    }
    static void std_grade(ObjectPassing2 g)
    {
        if(g.perc>=80)
        {
            g.grade="A";
        }
        else if(g.perc>60 && g.perc<75)
        {
            g.grade="B";
        }
        else if(g.perc>=60 && g.perc<50)
        {
            g.grade="C";
        }
        else 
            g.grade="F";
    }
}

/******OUTPUT****
run:
Enter name of the Student: kp
Enter Roll No.: 1
Enter Percentage of the Student: 60.5
***********************
Student name: kp
Student Roll no.: 1
Student's Percentage: 60.5
Student's Grade: B
***********************
***********************
Enter name of the Student: lp
Enter Roll No.: 2
Enter Percentage of the Student: 95
***********************
Student name: kp
Student Roll no.: 1
Student's Percentage: 60.5
Student's Grade: B
***********************
***********************
Enter name of the Student: kpkpk
Enter Roll No.: 3
Enter Percentage of the Student: 85.0
***********************
Student name: kp
Student Roll no.: 1
Student's Percentage: 60.5
Student's Grade: B
***********************
*/