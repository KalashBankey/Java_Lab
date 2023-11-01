class ThreadEx3 extends Thread
{
	public static void main(String[] args) {
	    ThreadEx3 t1=new ThreadEx3();
	    t1.start();
	    ThreadEx3 t2=new ThreadEx3();
	    t2.start();
	    ThreadEx3 t3=new ThreadEx3();
	    t3.start();
	    System.out.println("outside thread");
	}
	    public void run(){
	        System.out.println("run method");
	    }
}
