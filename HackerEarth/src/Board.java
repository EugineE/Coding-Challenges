
import java.util.*;


public class Board {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String v[] = s.nextLine().trim().split("\\s+");
        int n,k;
        n=Integer.parseInt(v[0]);
        
        k=Integer.parseInt(v[1]);
        int x[]=new int[k+1];
        int y[]=new int[k+1];
        int a = 0,b = 0;
        String xv[]=s.nextLine().trim().split("\\s+");
        String yv[]=s.nextLine().trim().split("\\s+");
        for (int i = 0; i < k; i++) {
            x[i]=Integer.parseInt(xv[i]);
            y[i]=Integer.parseInt(yv[i]);
           if((x[i]==n&&y[i]==1)||(x[i]==1&&y[i]==n)){
                a=x[i];
                b=y[i];
           }else if((x[i]==1&&y[i]==1)||(x[i]==n&&y[i]==n)){
               a=x[i];
               b=y[i];
           }
        }
        int c=0;
        for(int i=0;i<k;i++){
            if(a==x[i]&&b==y[i]){}
            else if(a==x[i]){
                
            }
        }

        System.out.println("Hello World!");
    }
}
