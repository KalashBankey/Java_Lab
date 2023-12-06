class A{
    public <T> void generics(T data){
        System.out.println("Generics Method:");
        System.out.println("Data Passed: "+data);
    }
}
public class Gen1
{
	public static void main(String[] args) {
	    A a1=new A();
	    a1.<String>generics("String passed");
	    a1.<Integer>generics(25);
	    a1.<Boolean>generics(true);
	}
}
