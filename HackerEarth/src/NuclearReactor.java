import java.util.Scanner;


public class NuclearReactor {
    public static void main(String[] args) {    
        int a, n, k;
        Scanner in=new Scanner(System.in);
        String argv[]=in.nextLine().trim().split(" ");
        a = Integer.parseInt(argv[0]);
        n = Integer.parseInt(argv[1]);
        k = Integer.parseInt(argv[2]);    
        //a no of particles
        //n max particle in a chamber
        //k no of chambers
        
        //BEGIN -- User code
        int re[]=new int[k];
         for(int j=0;j<k;j++){
             re[j]=0;
            }
        for(int i=1;i<=a;i++){
            for(int j=0;j<k;j++){
              if(re[j]+1<=n){
                  re[j]+=1;
                  break;
              }
              else{
                  re[j]=0;
              }
            }
        }
        for(int j=0;j<k;j++){
             System.out.print(re[j]+"\t");
            }
        //END -- User code
    }
}
/*input:3 1 3
output :1 1 0*/



