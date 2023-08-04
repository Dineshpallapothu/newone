package MultiThreads;
public class SleepExp2 extends Thread  
{    
    @Override
	public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(-500); // sleep time is negative  
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        SleepExp2 t1=new SleepExp2();    
        SleepExp2 t2=new SleepExp2();    
        t1.start();    
        t2.start();    
    }    
}  