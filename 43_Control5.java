/*
Program of labeled for loop (breaking the outer loop)
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Control5 
{
    public static void main(String[]args)
    {
        start1:
        for(int i=1;i<=5;i++)
        {
            start2:
            for(int j=1;j<=5;j++)
            {
                if(i==4&&j==3)
                {
                    break start1;
                }
                System.out.println(i+ " "+j);
            }
        }
    }
}

/******OUTPUT*****
 run:
1 1
1 2
1 3
1 4
1 5
2 1
2 2
2 3
2 4
2 5
3 1
3 2
3 3
3 4
3 5
4 1
4 2
 */