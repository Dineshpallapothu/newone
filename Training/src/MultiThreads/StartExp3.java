package MultiThreads;
public class StartExp3 extends Thread  
{    
    @Override
	public void run()  
    {    
    System.out.println("First thread running...");    
    }    
    public static void main(String args[])  
    {    
        StartExp3 t1=new StartExp3();    
        t1.start();    
        // It will through an exception because you are calling start() method more than one time   
        t1.start();   	
        
        
    }    
}    