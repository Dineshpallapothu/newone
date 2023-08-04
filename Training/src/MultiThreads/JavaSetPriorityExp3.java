package MultiThreads;
public class JavaSetPriorityExp3 extends Thread  
{    
    @Override
	public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        JavaSetPriorityExp3 t1=new JavaSetPriorityExp3();    
        // print the normal priority of this thread  
        t1.setPriority(Thread.NORM_PRIORITY);    
        // starting the thread   
        t1.start();    
    }    
}  