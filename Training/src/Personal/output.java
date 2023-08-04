package Personal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class output 
    {
        public static void main(String args[])
        { 
//           String c = "Hello i love java";
//           boolean var;
//           var = c.startsWith("Hello");
//           System.out.println(var);
        	Object i = new ArrayList().iterator(); 
            System.out.print((i instanceof List)+","); 
            System.out.print((i instanceof Iterator)+","); 
            System.out.print(i instanceof ListIterator); 
        }
    }