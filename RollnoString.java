import java.util.*;
public class RollnoString
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name");
	    String name=sc.nextLine();
	    System.out.println("Enter enroll");
	    String En=sc.nextLine();
	    System.out.println("Enter year");
	    int year=sc.nextInt();
	    String y=String.valueOf(year);
	    System.out.println(name+y.substring(2,4)+En+"@acropolis.in");
	
	}
}
