
import java.util.*;


public class Lizard {
    public static void main(String args[] ) throws Exception {
        

        //Scanner
        Scanner s = new Scanner(System.in);
        String v = s.nextLine().trim();
        int t=Integer.parseInt(v);
        for (int j = 0; j < t; j++) {
            String val[]=s.nextLine().trim().split("\\s+");
            int n=Integer.parseInt(val[0]);
            int m=Integer.parseInt(val[1]);
            String l[][]=new String[m][2];
            for(int i=0;i<m;i++){
               String gen[]=s.nextLine().trim().split("\\s+");
               l[i][0]=gen[0];
               l[i][1]=gen[1];
            }
            Boolean flag=sample(n,m,l);
            if(flag)
            System.out.println("Suspicious lizards found!");
            else
            System.out.println("No suspicious lizards found!");
        }
    }
    public static Boolean sample(int n,int m,String l[][]){
        String a[]=new String[n+1];
        for(int i=0;i<m;i++){
            int x=Integer.parseInt(l[i][0]);
            int y=Integer.parseInt(l[i][1]);
            if((a[x]==null)&&(a[y]==null)){
               a[x]="m";
               a[y]="f";
            }else if(a[x]==null){
                if(a[y]=="f")
                    a[x]="m";
                else
                    a[x]="f";
            }else if(a[y]==null){
                if(a[x]=="m")
                    a[y]="f";
                else
                    a[y]="m";
            }else if(a[x].equals(a[y]))
            {
                return true;
            }
        }
        return false;
    }
}
