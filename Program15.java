//15.Demonstrate the java class using getter setter method for accessing private data members
class A
{	
 int x;
 int y;
 
 public void getter(int a,int b)
 {
	x=a;
	y=b;
 }
 void setter()
 {
 System.out.println("x = "+x);
 System.out.println("y = "+y);
 }
}
public class Program15
{
	public static void main(String a[])
	{
		A a1=new A();
		a1.setter();
		a1.getter(10,20);
		a1.setter();
	}
}
