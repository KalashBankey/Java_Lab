class ThreadEx1 extends Thread
{
	public static void main(String[] args) {
	    ThreadEx1 thread=new ThreadEx1();
	    thread.start();
	    System.out.println("outside thread");
	}
	    public void run(){
	        System.out.println("run method");
	    }
}
