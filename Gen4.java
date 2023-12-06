class A<E>{
    public E data1;
    public A(E data1){
       this.data1=data1;
    }
    public E display(){
    return data1;
    }
}
public class Gen4{
	public static void main(String[] args) {
	    A<String> a1=new A<>("Kalash");
	    System.out.println("Data returned "+a1.display());
	    A<Integer> a2=new A<>(73);
	    System.out.println("Data returned "+a2.display());
	}
}
