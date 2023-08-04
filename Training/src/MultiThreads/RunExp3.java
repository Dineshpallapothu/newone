package MultiThreads;
public class RunExp3 extends Thread  
{    
    @Override
	public void run()  
    {    
        for(int i=1;i<6;i++)  
        {    
            try  
            {  
                Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}    
        System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        RunExp3 t1=new RunExp3();    // t1 and t2 as a normal objects 
        RunExp3 t2=new RunExp3();    
        t1.run();    
        t2.run();    
    }    
}    