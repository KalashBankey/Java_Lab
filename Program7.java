//7.Sum of Natural Numbers using for loop
import java.util.*;
class Program7
{
	public static void main(String a[])
	{
	System.out.println("Enter value of n:-");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("Sum of first " + n + " Natural Numbers is = "+sum);
	}
}
