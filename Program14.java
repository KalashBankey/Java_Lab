//14.Demonstrate using Instance/class  Variable in a Java Program by creating a simple public class
class A
{
 int x;
 void show()
 {
	x=10;
	System.out.println("x = "+x);
 }
}
public class Program14
{
	public static void main(String a[])
	{
		A a1=new A();
		a1.show();
	}
}
