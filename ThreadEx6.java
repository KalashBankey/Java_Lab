import java.util.*;
class ThreadEx6 extends Thread
{
    ThreadEx6(String s){
        super(s);
        System.out.println("New thread created "+this);
        start();
    }
	public void run(){
	        try{
	            for(int i=0;i<10;i++){
	                System.out.println("New thread created "+this);
	                Thread.sleep(1500);
	            }
	        }
	        catch(Exception e){
	            System.out.println("Currently executing thread is interrupted");
	        }
	        System.out.println("Currently executing thread run is terminated");
	    }
	    public static void main(String args[]){
	        ThreadEx6 t1=new ThreadEx6("t1");
	        ThreadEx6 t2=new ThreadEx6("t2");
	    }
}
