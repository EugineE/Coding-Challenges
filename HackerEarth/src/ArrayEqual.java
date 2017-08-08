
import java.util.*;


public class ArrayEqual {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[]=new int[n];
        int sum=0,m;
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
             sum+=a[i]; 
        }
        m=sum/n;
        int i=0;
        int c=0;
        while(true){
                int d=0;
                if(a[i]>m&&(a[(i+1)%(n-1)]<m)){
                    d=a[i]-m;
                    a[i]-=d;
                    a[(i+1)%(n-1)]+=d;
                    c+=d;
                    continue;
                }else if(i!=0){ 
                
                if(a[i]>m&&a[(i-1)]<m){
                    d=a[i]-m;
                    a[i]-=d;
                    a[i-1]+=d;
                    c+=d;
                    continue;
                }else{
                    i++;
                }
                    
                }else{
                    if(a[i]>m&&a[n-1]<m){
                        d=a[i]-m;
                        a[i]-=d;
                        a[n-1]+=d;
                        c+=d;
                        
                        continue;
                    }else{
                        i++;
                    }
                }
                int va=0;
            for(int j=0;j<n;j++){
                if(a[j]==m){
                   va++; 
                }
            }
            if(va==n-1){
                break;
            }else if(i==n-1){
                i=0;
            }
        }

        System.out.println(c);
    }
}



