package Thread.java;

public class Threaddemo {
	public static void main(String[] args) 
	  {
	    Threaddemo t1 = new Threaddemo();
	    t1.start();  
	    try
	    {
	       for(int i = 1;i<=100;i+=10)
	       {
	        System.out.println("Main Thread says " + i);
	        Thread.sleep(1500);
	       }
	       System.out.println("Main Thread Ends here ");
	    }
	    catch(InterruptedException exc)
	    {
	        exc.printStackTrace();
	    }
	  }

}
