import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayPermutation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
       int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int k=in.nextInt();
            in.nextLine();
            String vala[]=in.nextLine().trim().split("\\s+");
            String valb[]=in.nextLine().trim().split("\\s+");
            int a[]=new int[n];
            int b[]=new int[n];
            for(int j=0;j<n;j++){
              a[j]=Integer.parseInt(vala[j])  ;
                b[j]=Integer.parseInt(valb[j])  ;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int m=n-1;
             for(int j=0;j<n&&m>0;j++,m--){
              if(a[j]+b[m]>=k){
                  continue;
              }else{
                  break;
              }
            }
            if(m==0){
                System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
        }
    }
}



