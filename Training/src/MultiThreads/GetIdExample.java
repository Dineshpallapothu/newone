package MultiThreads;
public class GetIdExample extends Thread  
{    
    @Override
	public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating one thread  
        GetIdExample t1=new GetIdExample();    
        // Returns the identifier of this Thread  
        System.out.println("Name of t1: "+t1.getName());  
        System.out.println("Id of t1: "+t1.getId());   
        // Start the thread   
        t1.start();  
    }    
}   