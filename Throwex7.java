import java.util.*;
public class Throwex7
{
    static void method(int a[])throws ArrayIndexOutOfBoundsException{
            for(int i=0;i<=a.length;i++)
            {
                System.out.println(a[i]);
            }
     }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[];
	    int n=sc.nextInt();
	    a=new int[n];
	    try{
	        method(a);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("caught in main method "+ e);
	    }
	}
}
