package MultiThreads;
public class JavaSetPriorityExp1 extends Thread  
{    
    @Override
	public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY);    
        // call the run() method  
        t1.start();    
    }    
}  