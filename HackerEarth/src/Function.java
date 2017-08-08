
import java.util.*;


public class Function {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int a,b,c,d,k;
            double r=0;
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            d=s.nextInt();
            k=s.nextInt();
            int j=0;
          //  System.out.println(k);
            while(r<=k){
            	
            	double t1=(a*Math.pow(j,3));
            	double t2=(b*Math.pow(j,2));
            	double t3=(c*j);
                r=(t1+t2+t3+d);
               
            	
                j++;
                System.out.println(r);
            }
            System.out.println(j-2);
        }
        

        //
    }
}


