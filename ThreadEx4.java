class ThreadEx4 implements Runnable
{
	public static void main(String[] args) {
	    ThreadEx4 t1=new ThreadEx4();
	    Thread thread1=new Thread(t1);
	    thread1.start();
	    ThreadEx4 t2=new ThreadEx4();
	    Thread thread2=new Thread(t2);
	    thread2.start();
	    ThreadEx4 t3=new ThreadEx4();
	    Thread thread3=new Thread(t3);
	    thread3.start();
	    System.out.println("outside thread");
	}
	    public void run(){
	        System.out.println("run method");
	    }
}
