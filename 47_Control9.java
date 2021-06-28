/*
* Program of 'Loop break statement'
*/
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Control9 
{
    public static void main(String [] args)
    {
        for(int i=1;i<=15;i++)
        {
            if(i==8)
            {
                break;
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
7
 */