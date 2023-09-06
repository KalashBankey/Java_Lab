//16.Demonstrate the use of static variable
class A
{	
 static int x=10;
 void show()
 {
 System.out.println(x++);
 }
}
public class Program16
{
	public static void main(String a[])
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		a1.show();
		a2.show();
		a1.show();
		a3.show();
		a2.show();
		a1.show();
	}
}
  