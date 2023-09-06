//3.Swap two numbers using temporary variable
import java.util.*;
class Program3
{
	public static void main(String a[])
	{
	System.out.println("Enter two Integers:-");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int t;
	System.out.println("Before Swapping");
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	t=x;
	x=y;
	y=t;
	System.out.println("After Swapping");
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	
	}
}
	