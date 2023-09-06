//5.Check whether an alphabet is vowel or consonant using if..else statement
import java.util.*;
class Program5
{
	public static void main(String a[])
	{
	System.out.println("Enter an alphabet");
	Scanner sc=new Scanner(System.in);
	char x=sc.next().charAt(0);
	char ch[]={'a','e','i','o','u'};
	int c=0;
	for(int i=0;i<5;i++)
	{	
		if(ch[i]==x)
		{
			c=1;
		}
	}
	if(c==1)
	{
		System.out.println("Alphabet is vowel");
    }
	else
	{
		System.out.println("Alphabet is consonant");
	}
	}
}


