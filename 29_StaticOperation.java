/*
Program for SIMPLE static opeartion
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class StaticOperation 
{
    int rollno;
    String name;    
    static String college ="IGNOU BCA";
    
    StaticOperation(int a, String b)
    {
        rollno=a;
        name=b;
    }
    void disp()
    {
        System.out.println(+rollno+" " +name +" " +college);
    }
    public static void main(String [] args)
    {
        StaticOperation obj1=new StaticOperation(111,"Geeky");
        StaticOperation obj2=new StaticOperation(112,"Keshav");
        
        obj1.disp();
        obj2.disp();
     }
}

/*****OUTPUT*****
111 Geeky IGNOU BCA
112 Keshav IGNOU BCA
 */