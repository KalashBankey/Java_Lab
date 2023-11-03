class A{
    String s="abc0000x1505";
    static int amt=100000;
    public void withdrawl(int x,String p){
        if(p==s){
        amt=amt-x;
        System.out.println("After withdrawl "+amt);}
        else  System.out.println("Account do not match");
        }
    public void deposite(int y,String p){
        if(p==s){
        amt=amt+y;
        System.out.println("After deposite "+amt);}
        else  System.out.println("Account do not match");
    }
}
class B extends Thread{
    A a=new A();
    public void run(){
        a.withdrawl(50000,"abc0000x1505");
    }
}
class C extends Thread{
    A a=new A();
    public void run(){
        a.deposite(10000,"abc0000x1505");
    }
}
class Ex2
{
	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.start();
		c.start();
	}
}
