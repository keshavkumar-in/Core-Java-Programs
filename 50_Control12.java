/*
* Program of 'continue statement in an inner for loop'
*/
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Control12 
{
        public static void main(String [] args)
        {
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    if(i==3&&j==2)
                    {
                        continue;
                    }
                    System.out.println(i+" "+j);
                }
            }
        }
}

/*****OUTPUT*****
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
3 3
3 4
3 5
4 1
4 2
4 3
4 4
4 5
5 1
5 2
5 3
5 4
5 5
 */