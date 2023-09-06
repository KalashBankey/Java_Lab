/*20.Create a program in java to create a class Box with private members as length, breadth, height. 
Create two methods getDimension() , setDimension() to set and get values.  Create instances of this class to call the methods.
*/

class Box
{
	int length;
	int breadth;
	int height;
	void getDimension(int a,int b,int c)
	{
		length=a;
		breadth=b;
		height=c;
	}
	void setDimension()
	{
	System.out.println("Length = "+length);
	System.out.println("Breadth = "+breadth);
	System.out.println("Height = "+height);
	}
}
class Program20
{
	public static void main(String a[])
	{
		Box b1=new Box();
		Box b2=new Box();
		System.out.println("Dimensions of box b1");
		b1.getDimension(10,20,30);
		b1.setDimension();
		System.out.println("Dimensions of box b1");
		b2.getDimension(100,200,300);
		b2.setDimension();
	}
}