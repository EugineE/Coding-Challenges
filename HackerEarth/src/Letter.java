
import java.util.*;



public class Letter {    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
           int n,m;
           n=s.nextInt();
           m=s.nextInt();
           String a[]=new String[n];
           for(int j=0;j<n;j++){
               a[j]=s.next();
           }
           int b[][]=new int[n][n];
           int min=0,rj = 0;
           int r;
           for(int j=0;j<n;j++){
             r =0;
               Character y=a[j].charAt(0);
               int yv=(int) y;
               for(int k=0;k<n;k++){
                   
               
               Character x=a[k].charAt(0);
               int xv=(int) x;
               b[j][k]=Math.abs(xv-yv);
               r+=b[j][k];
               } 
               
               if(min==0){
                   min=r;
                   rj=j;
               }else if(min>r){
                   min=r;
                   rj=j;
               }
           }
           
           
            System.out.println(a[rj]);
        }
        

        //System.out.println("Hello World!");
    }
}



