import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equal {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int a[]=new int[n];
             for(int j=0;j<n;j++){
                 a[j]=in.nextInt();
                 
             }
            Arrays.sort(a);
           
            int c=0;
            for(int j=0;j<n;j++){
                int v= a[j];
                if(j+1!=n)
                if(v==a[j+1]){
                    continue;
                }
                else {
                		//a[j+1]-v==1||a[j+1]-v==2||a[j+1]-v==5
                    int d=a[j+1]-v;
                    int dc=d;
                    if(dc/5!=0){
                    	c+=dc/5;
                    	dc=dc/5;
                    }else if(dc/2!=0){
                    	c+=dc/2;
                    	dc=dc/2;
                    }else if(dc/1!=0){
                    	c+=dc/1;
                    	dc=dc/1;
                    }
                    
                    int k=0;
                   // c++;
                    while(k<n){
                        if(k==j+1){
                            k++;
                            continue;
                        }else{
                            a[k]+=d;
                            k++;
                            
                        }
                    }
                }
                 
             }
           
            for(int j=0;j<n;j++){
            	System.out.println(a[j]);
                
            }
            System.out.println(c);
            String ax="hi";
            Character nm=ax.charAt(0);
        }
    }
}



