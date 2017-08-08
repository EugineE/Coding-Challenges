import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factor {

    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
       Arrays.sort(b);
        int f=a[a.length-1],c=0;
        int x=getX(a,f);
        while(true){
        if(x<=b[0]){
        for(int j = 0; j < b.length; j++){
                    if(b[j]%x==0){
                        continue;
                    }else{
                        x=getX(a,x+1);
                        j=0;
                    }
            
             } 
        System.out.println(x);
        x=getX(a,x+1);
            c++;
            continue;
        }else{
            break;
        }
        }
        return c;
    }
        
      static int getX(int[] a,int f){
           
        for(int i = 0; i < a.length; i++){
           if(f%a[i]==0){
               continue;
                
           }else{
               f++;
                i=0;
           }
         
        } return f; }
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
