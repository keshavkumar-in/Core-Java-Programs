/*
Comlete Student report Card
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class StudentRecord 
{
    int rollno;
    String name;
    int s1,s2,s3,s4,s5;
    
    int total;
   float avg;
    
        
   int insert(int r, String n, int sb1, int sb2, int sb3, int sb4, int sb5)
    {
        rollno=r;
        name=n;
        s1=sb1;
        s2=sb2;
        s3=sb3;
        s4=sb4;
        s5=sb5;  
       
        return total=s1+s2+s3+s4+s5;
      }
    
   public void disp()
    {
        System.out.println("Roll no.: "+rollno+","+"Name: "+name +","+"Total: "+total+","+ "Average: "+(avg=(total/5)));
    }
    
}

class studrec
{
    public static void main(String args[])
    {
        
        StudentRecord obj1=new StudentRecord();
        StudentRecord obj2=new StudentRecord();
              
        obj1.insert(100, "Geeky", 90, 80, 70, 80, 60);
        obj2.insert(101,"Keshav",98,95,85,88,89);
       
        obj1.disp();
        obj2.disp();
    }
}

/****OUTPUT****
Roll no.: 100,Name: Geeky,Total: 380,Average: 76.0
Roll no.: 101,Name: Keshav,Total: 455,Average: 91.0
 */