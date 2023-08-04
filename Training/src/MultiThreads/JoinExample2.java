package MultiThreads;
public class JoinExample2 extends Thread  
{    
    @Override
	public void run()  
    {    
        for(int i=1; i<=5; i++)  
        {    
            try  
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads  
        JoinExample2 t1 = new JoinExample2();    
        JoinExample2 t2 = new JoinExample2();    
        JoinExample2 t3 = new JoinExample2();    
        // thread t1 starts  
        t1.start();  
        // starts second thread when first thread t1 is died.  
        try  
        {    
            t1.join(2500);    
        }catch(Exception e){System.out.println(e);}    
        // start t2 and t3 thread   
        t2.start();   
        t3.start();    
    }    
}  