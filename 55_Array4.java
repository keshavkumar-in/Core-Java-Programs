/*
* Program to find the maximum value present in it along with its index position in an array.
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Array4 
{
    public static void main(String args [])
    {
    int a[]={12,26,95,105,115,120,130,500,288,655,100};
    int max=a[0];
    int position=0;
        
    for(int i=0;i <(a.length-1);i++)
        {
            if(max>a[i])
            {
                continue;
            }
            else
            {
                 max =a[i];
                 position=i+1;
            }
        }
    System.out.println("Maximum value is "+max+" at position "+position+".");
    }

}
/*****OUTPUT*****
 * Maximum value is 655 at position 10.
 */