//17.Demonstrate the use of static method
class A
{	
 static int x=10;
 static void show()
 {
 System.out.println(++x);
 }
}
public class Program17
{
	public static void main(String a[])
	{
		A.show();
	}
}