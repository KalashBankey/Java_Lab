//4.Check whether a number is even or odd using if...else statement
import java.util.*;
class Program4
{
	public static void main(String a[])
	{
	System.out.println("Enter a number:-");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(x%2==0)
	{
		System.out.println(x+" is even number.");
	}
	else 
	{
		System.out.println(x+" is odd number.");
	}	
	}
}
	