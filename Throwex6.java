public class Throwex6
{
    public static int divideNum(int n,int m)throws ArithmeticException{
            int div=n/m;
            return div;
     }
	public static void main(String[] args) {
	    try{
	        System.out.println(divideNum(45,0));
	    }
	    catch(ArithmeticException e){
	        System.out.println("Num cannot be divided by zero");
	    }
	    System.out.println("Rest code...");
	}
}
