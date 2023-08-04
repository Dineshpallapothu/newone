package MultiThreads;
public class JavaSetPriorityExp2 extends Thread  
{    
    @Override
	public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        JavaSetPriorityExp2 t1=new JavaSetPriorityExp2();    
        // print the minimum priority of this thread  
        t1.setPriority(Thread.MIN_PRIORITY);    
        // This will call the run() method  
        t1.start();    
    }    
}  