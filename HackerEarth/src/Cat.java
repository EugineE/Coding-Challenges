
import java.util.*;


public class Cat  {
    public static void main(String args[] ) throws Exception {
        

        //Scanner
        Scanner s = new Scanner(System.in);
       // int num=Integer.parseInt(s.nextLine());
        String val = s.nextLine().trim();
        int n=Integer.parseInt(val);
       // int a[]=new int[n+1];
        //int b[]=new int[n+1];
        String va[]=s.nextLine().trim().split("\\s+");
        String vb[]=s.nextLine().trim().split("\\s+");
        Arrays.sort(va);
        Arrays.sort(vb);
        int r=0,a,b;
        for (int i = 0; i < n; i++) {
           a=Integer.parseInt(va[i]);
           b=Integer.parseInt(vb[i]);
           r=r+(a*b);
        }
       /* Arrays.sort(a);
        
        Arrays.sort(b);
        int r=0;
        for(int i=1;i<=n;i++){
            r=r+(a[i]*b[i]);
        }*/

        System.out.println(r);
    }
}


