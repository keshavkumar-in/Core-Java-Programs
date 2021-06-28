/*
 * Program for Simple Array
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Array 
{
    public static void main(String [] args)
    {
       //   or int [] x;
       //   or x=new int[10];
       //   or int [] x=new int[10];
        
        int [] x=new int [10];
        
        for (int i=0;i<=(x.length-1);i++)
        {
            x[i]=i+1;
            
            System.out.println(x[i]+"  ");
        }
        
        System.out.println("  ");
    }
}

/*****OUTPUT******
1  
2  
3  
4  
5  
6  
7  
8  
9  
10  
 */