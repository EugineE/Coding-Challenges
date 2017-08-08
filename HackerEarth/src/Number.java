
import java.util.*;


public class Number { 
	public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
       String v = s.nextLine().trim();
       
       // Double r=s.nextDouble();
        int a[]={6,2,5,5,4,5,6,3,7,6};
        int r=0;
        for (int i = 0; i <v.length() ; i++) {
        	String st=v.substring(i, i+1);
           int n=Integer.parseInt(st);
           r+=a[n];
            
        }
        

        System.out.println(r);
    }
}


