
import java.util.*;


public class PrimeGrid {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int result=0,n = s.nextInt();
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
           // System.out.println("hello world");
        }
        
         for (int i = 0; i < n; i++) {
            
            for(int j=0;j<n;j++){
            	int count=0,sum=0;
                 int r=i,c=j;
                if(r+1<n){
                	
                  sum+=a[r+1][c];  
                }
                if(r-1>=0){
                    sum+=a[r-1][c];
                   
                }
                 if(c+1<n){
                  sum+=a[r][c+1]; 
                 
                }
                if(c-1>=0){
                    sum+=a[r][c-1];
                    System.out.println(a[r][c-1]);
                }
               //System.out.println(sum);
                if(prime(sum)){
                    result++;
                }
            }
           
        }
        

        System.out.println(result);
    }
    public static Boolean prime(int sum){
        int i=0;
        for(i=2;i<=sum;i++){
            if(sum%i==0){
                break;
            }
        }
        if(i==sum){
            return true;
        }else{
            return false;
        }
    }
}



