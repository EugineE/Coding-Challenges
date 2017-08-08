
import java.util.*;


public class Game {
    public static void main(String args[] ) throws Exception {
        

        //Scanner
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine().trim();
        int t=Integer.parseInt(val);
        int n,r,s;
        for (int i = 0; i < t; i++) {
           String v[]=sc.nextLine().trim().split("\\s+");
           r=Integer.parseInt(v[0]);
           s=Integer.parseInt(v[1]);
           n=Integer.parseInt(v[2]);
           String l[]=sc.nextLine().trim().split("\\s+");
         //  System.out.println(l[0]);
           int a[]=new int[n+1];
           for(int j=0;j<n;j++){
               a[j]=Integer.parseInt(l[j]); 
              // System.out.println(a[j]);
           }
           int res=sample(r,s,n,a);
           if(res==1)
            System.out.println("Raghu Won");
            else if(res==2)
            System.out.println("Sayan Won");
            else
            System.out.println("Tie");
        }
    }
    public static int sample(int r,int s,int n,int a[]){
        Arrays.sort(a);
        //System.out.println(a.toString());
        int rc=0,sc=0;
        for(int i=0;i<n;i++){
            if(r>=a[i]){
                r-=a[i];
                rc++;
                //System.out.println(r);
            }
            if(s>=a[i]){
                s-=a[i];
                sc++;
            }
        }
       // System.out.println(rc+"hj" +sc);
        if(rc>sc)
            return 1;
        else if(sc>rc)
            return 2;
    return 10;    
    }
}
