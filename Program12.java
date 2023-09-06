//12.Java Program to Reverse the number
import java.util.*;
class Program12
{
	public static void main(String ar[])
	{
	System.out.println("Enter a number:-");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a,n1=n;
	int sum=0;
	while(n!=0)
	{
		a=n%10;
		sum=sum*10+a;
		n=n/10;
	}
	System.out.println("Reverse of "+n1+" is "+sum);
	}
}
