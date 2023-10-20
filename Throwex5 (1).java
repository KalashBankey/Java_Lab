public class Throwex5
{
    static void method(int a)throws ArrayIndexOutOfBoundsException{
            System.out.println("Inside the method");
     }
	public static void main(String[] args) {
	    try{
	        int arr[]={1,2,3};
	        method(arr[4]);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("caught in main method"+ e);
	    }
	}
}