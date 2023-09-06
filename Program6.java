//6.Check if a Number is Positive or Negative using if else
import java.util.*;
class Program6
{
	public static void main(String a[])
	{
	System.out.println("Enter an Integer:-");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(x>0)
	{
		System.out.println(x+" is positive integer.");
	}
	else if(x<0)
	{
		System.out.println(x+" is negative integer.");
	}	
	else
	{
		System.out.println("x is neither positive nor negative integer.");
	}
	}
}
