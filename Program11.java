//11.Find GCD of two numbers using for loop and if statement
import java.util.*;
class Program11
{
	public static void main(String a[])
	{
	System.out.println("Enter two Integers:-");
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int gcd=1;
	int l;
	if(n1>n2) l=n2;
	else l=n1;
	for(int i=2;i<=l;)
	{
		if(n1%i==0 && n2%i==0)
		{
		gcd=gcd*i;
		n1=n1/i;
		n2=n2/i;
		}
		else i++;
	}
	
	System.out.println("GCD of n1 & n2 = " + gcd);
	}
}
