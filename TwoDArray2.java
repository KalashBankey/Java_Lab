/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class TwoDArray2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int [][]a=new int[3][3];
	        System.out.println("Enter 2D Array Elements ");
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                a[i][j]=sc.nextInt();
	            }
	            System.out.println();
	        }
	        for(int i[]: a)
	        {
	            for(int j: i)
	            {
	                System.out.print(j+ " ");
	            }
	            System.out.println();
	        }
	}
}
