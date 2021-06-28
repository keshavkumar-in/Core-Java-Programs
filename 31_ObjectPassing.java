/*
 * Program on object passing
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
class ObjectPassing 
{
    String name;
    int rollno;
    float perc;
    String grade;
    
    ObjectPassing(String s, int r, float p)
    {
        name=s;
        rollno=r;
        perc=p;
    }
    
    void disp()
    {
        System.out.println("Student name: "+name);
        System.out.println("Student Roll no.: "+rollno);
        System.out.println("Student's Percentage: "+perc);
        System.out.println("Student's Grade: "+grade);
        System.out.println("***********************");
    }
}
class std_marks
{
    public static void main(String [] args)
    {
        ObjectPassing obj1=new ObjectPassing("Geeky",100,85);
        ObjectPassing obj2=new ObjectPassing("Keshav",101,70);
        ObjectPassing obj3=new ObjectPassing("Geeky Keshav",102,50);
        
        std_grade(obj1);
        System.out.println("**********************");
        obj1.disp();
        std_grade(obj2);
        obj2.disp();
        std_grade(obj3);
        obj3.disp();
    }
    static void std_grade(ObjectPassing g)
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
 **********************
Student name: Geeky
Student Roll no.: 100
Student's Percentage: 85.0
Student's Grade: A
***********************
Student name: Keshav
Student Roll no.: 101
Student's Percentage: 70.0
Student's Grade: B
***********************
Student name: Geeky Keshav
Student Roll no.: 102
Student's Percentage: 50.0
Student's Grade: F
***********************
 */