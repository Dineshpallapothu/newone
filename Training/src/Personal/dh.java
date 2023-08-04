package Personal;

import java.util.Scanner;

public class dh {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long a[]=new long[N];
        int c=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextLong(); 
        }

        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
        }
        System.out.println(c);

 }
	}


