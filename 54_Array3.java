/*
 * Program of 2-Diamensional Array
 */
package javaprograms;

/**
 *
 * @author Geeky Keshav
 */
public class Array3 
{
   public static void main(String [] args)
   {
       int a[] []=new int [3][3];
       int b[] []=new int [3][3];
       int c[][]=new int [3][3];
             
       for(int i=0;i<3;i++)
       {
           for (int j=0;j<3;j++)
           {
                  a[i][j]=4*(j+1);
           }
       }
           for(int i=0;i<3;i++)
           {
               for(int j=0;j<3;j++)
               {
                   b[i][j]=5*(j+1);
               }
           }
           for(int i=0;i<3;i++)
           {
               for(int j=0;j<3;j++)
               {
                   c[i][j]=a[i][j]+b[i][j];
               }
           }
           for(int i=0;i<3;i++)
           {
               for(int j=0;j<3;j++) 
               {
                   System.out.println("\t"+c[i][j]);
               }
               System.out.println("\n");
           }
       }
}
/*****OUTPUT****
 run:
	9
	18
	27


	9
	18
	27


	9
	18
	27
 */