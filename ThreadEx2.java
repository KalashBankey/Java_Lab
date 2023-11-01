class ThreadEx2 implements Runnable
{
	public static void main(String[] args) {
	    ThreadEx1 obj=new ThreadEx1();
	    Thread thread=new Thread(obj); 
	    thread.start();
	    System.out.println("outside thread");
	}
	    public void run(){
	        System.out.println("run method");
	    }
}
