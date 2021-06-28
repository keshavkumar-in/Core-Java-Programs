/*
* Program of 'continue statement'
*/
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Control11 
{
    public static void main(String [] args)
    {
        for(int i=1;i<=10;i++)
        {
            if(i==7)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}

/******OUTPUT****
 run:
1
2
3
4
5
6
8
9
10
 */