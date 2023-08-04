package MultiThreads;
public class JavaSetPriorityExp5 extends Thread  
{    
    @Override
	public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        JavaSetPriorityExp5 t1=new JavaSetPriorityExp5();    
        JavaSetPriorityExp5 t2=new JavaSetPriorityExp5();  
        // set the priority  
        t1.setPriority(12);  //exception occurs because max priorty is 10 exception name is illegalArguments
        t2.setPriority(7);  
        // print exception because priority of t1 is greater than 10  
        System.out.println("Priority of thread t1 is: " + t1.getPriority());   
        System.out.println("Priority of thread t2 is: " + t2.getPriority());   
        // call the run() method  
        t1.start();  
    }  
}  