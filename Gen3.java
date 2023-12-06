class A<E>{
    public E a;
    public A(E data1){
       a=data1;
    }
    public E display(){
    return a;
    }
}
public class Gen3{
	public static void main(String[] args) {
	    A<String> a1=new A<>("Kalash");
	    System.out.println("Data returned "+a1.display());
	}
}
