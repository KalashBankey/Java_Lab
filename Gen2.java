class A{
    public <T,W> void generics(T data1,W data2){
        System.out.println("Generics Method:");
        System.out.println("Data Passed: "+data1);
        System.out.println("Data Passed: "+data2);
    }
}
public class Gen2
{
	public static void main(String[] args) {
	    A a1=new A();
	    a1.<String,Integer>generics("String passed",25);
	    
	}
}
