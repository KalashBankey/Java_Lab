//9.Generate Multiplication Table using for loop
import java.util.*;
class Program9
{
	public static void main(String a[])
	{
	System.out.println("Multiplication Table for number:-");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
	System.out.println(n+"x"+i+"="+n*i);
	}
	}
}
