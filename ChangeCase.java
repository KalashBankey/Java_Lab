//Convert the string from lower case to upper case or visa-versa
import java.util.*;
public class ChangeCase
{
	public static void main(String[] args) {
	
	System.out.println("Enter String");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println("Enter choice - 0 for lowercase, 1 for uppercase");
	int i=sc.nextInt();
	switch(i)
	{
	   case 0:
	       {
	        System.out.println(s.toLowerCase());
	        break;
	       }
	   case 1:
	       {
	       System.out.println(s.toUpperCase());
	       break;
	       }
	   default:
	       {
	       System.out.println("Invalid case");
	       }
	}
	
	}
}
