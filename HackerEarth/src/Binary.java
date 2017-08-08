
import java.util.*;


public class Binary {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine().trim());

        for (int i = 0; i < N; i++) {
           int a=Integer.parseInt(s.nextLine().trim());
           String line[]=s.nextLine().trim().split("\\s+");
           int arr[]=new int[a];
           for(int j=0;j<a;j++){
               arr[i]=Integer.parseInt(line[i]);
               }
        
            int r=score(arr);
            System.out.println(r);
        }
        }
      private static int score(int[] arr){
          int n=arr.length;
          int c=0;
           for(int i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                 int n1[]=new int[arr[i]/2];
                 int n2[]=new int[arr[j]/2];
                 n1=bin(arr[i]);
                   n2=bin(arr[j]);
                   int r=xor(n1,n2);
                   if(r==1){
                       c++;
                   }
               }
           }
       
            return c;           
       } 
        public static int[] bin(int n){
            int[] l=new int[(n/2)+1];
            int i=0;
            while(n!=0){
                l[i]=n%2;
                n=n/2;
                i++;
            }
            return l;
        }
      public static int xor(int n1[],int n2[]){
           int a=n1[0];
           int b=n2[0];
           if((a==1&&b==1)||(a==0&&b==0)){
               return 1;
           }else{
               return 0;
           }
       }
    }

	

	



