//Exception Handling
public class ExceptionHandling1
{
	public static void main(String[] args) {
		try{
		    int x=5;
		    int y=0;
		    System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
		    System.out.println("Arithmetic Exception=> " + e.getMessage());
		}
	}
}
