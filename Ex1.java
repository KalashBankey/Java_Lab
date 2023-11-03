class A{
    public void fun(int n1,int n2,int a){
        if(a%2==0){
        for(int i=n1;i<=n2;i++){
            if(i%2==0)
           System.out.println(i);
        }
        }
        else{
           for(int i=n1;i<=n2;i++){
            if(i%2==1)
           System.out.println(i);
        } 
        }
    }
}
class B extends Thread{
    A a=new A();
    public void run(){
        a.fun(0,20,0);
    }
}
class C extends Thread{
    A a=new A();
    public void run(){
        a.fun(0,20,1);
    }
}
class Ex1
{
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.start();
		c.start();
	}
}
