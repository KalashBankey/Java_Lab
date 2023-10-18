//Exception Handling
import java.util.*;
public class ExceptionHandling2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		try{
		    
		    int x=5;
		    System.out.println("Enter n:- ");
		    int y=sc.nextInt();
		    System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
		    System.out.println("Arithmetic Exception=> " + e.getMessage());
		}
	}
}
