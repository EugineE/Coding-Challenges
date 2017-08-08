
import java.util.*;


public class Min {
	public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int k = 0; k < t; k++) {
            int n=s.nextInt();
            int x=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            int b[]=new int[n];
            int r;
            for(int i=0;i<n;i++){
                r=0;
                for(int j=0;j<n;j++){
                    if(a[i]!=a[j]){
                        r++;
                    }
                }
                b[i]=r+1;
            }
            Arrays.sort(b);
            r=b[0];
            if(r==x){
            System.out.println("Good");
            }else if(r<x){
        

            System.out.println("Bad");
            }else{
                System.out.println("Average");
            }
            
        }
    }
}




