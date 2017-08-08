import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinVal {

    static int migratoryBirds(int n, int[] a) {
        // Complete this function
        int res[]=new int[n];
        int rc=0,r=a[0];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            res[i]=c;
        }
        for(int i=0;i<n;i++){
            if(rc<=res[i]){
                r=a[i];
                rc=res[i];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

