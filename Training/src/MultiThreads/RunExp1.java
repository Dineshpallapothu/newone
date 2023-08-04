package MultiThreads;
public class RunExp1 implements Runnable  
{    
    @Override
	public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
        RunExp1 r1=new RunExp1();    
        Thread t1 =new Thread(r1);    
        // this will call run() method   
        t1.start();    
    }    
}  