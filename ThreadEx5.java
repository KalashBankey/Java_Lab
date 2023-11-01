import java.util.*;
class ThreadEx5 implements Runnable
{
	public static void main(String[] args) {
	    ThreadEx5 t1=new ThreadEx5();
	    Thread thread1=new Thread(t1);
	    thread1.start();
	    ThreadEx5 t2=new ThreadEx5();
	    Thread thread2=new Thread(t2);
	    thread2.start();
	}
	    public void run(){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=1;i<=10;i++){
	            System.out.println(n+" * "+i+" = "+i*n);
	        }
	    }
}
