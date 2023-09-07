//This is a program for unboxing
public class Unboxing
{
	public static void main(String args[])
	{
	Integer a=new Integer(3);
	int i=a.intValue();
	int j=a;
	System.out.println(a+" "+i+" "+j);
	
	
	Long a2=new Long(5L);
	long i2=a2.longValue();
	long j2=a2;
	System.out.println(a2+" "+i2+" "+j2);
	
	Character a3=new Character('A');
	char i3=a3.charValue();
	char j3=a3;
	System.out.println(a3+" "+i3+" "+j3);
	
	Boolean a4=new Boolean(true);
	boolean i4=a4.booleanValue();
	boolean j4=a4;
	System.out.println(a4+" "+i4+" "+j4);
	
	Float a5=new Float(2.2F);
	float i5=a5.floatValue();
	float j5=a5;
	System.out.println(a5+" "+i5+" "+j5);

	}
}	