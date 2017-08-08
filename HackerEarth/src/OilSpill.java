import java.util.*;
public class OilSpill {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String val=in.nextLine();
        String mat[]=val.split(",");
        int m,n;
        m=Integer.parseInt(mat[0]);
        n=Integer.parseInt(mat[1]);
       int a[][]=new int[m+1][n+1];
        
        for(int i=1;i<=m;i++){
            val=in.nextLine();
           String ma[]=val.split(",");
            for(int j=1;j<=n;j++){
                a[i][j]=Integer.parseInt(ma[j-1].trim());
                
                
                }
            }
        val=in.nextLine();
        String matr[]=val.split(",");
        int r,c;
        
        r=Integer.parseInt(matr[0]);
        c=Integer.parseInt(matr[1]);
       // System.out.println(r+" "+c);
        int p;
       
        int r1=0,r2=0,c1=0,c2=0,count=0;
        
        while(true){
            p=a[r][c];
            //System.out.println(p);
             int k=0;
             String result[]=new String[4];
            r1=r+1;
            r2=r-1;
            c1=c+1;
            c2=c-1;
            if(r1<=m&&a[r1][c]<a[r][c]){
                result[k]=a[r1][c]+","+r1+","+c;
                k++;
                //System.out.println(result[k-1]);
                }
             if(r2>0&&a[r2][c]<a[r][c]){
                result[k]=a[r2][c]+","+r2+","+c;
                k++;
               // System.out.println(k);
                }
            if(c1<=n&&a[r][c1]<a[r][c]){
                result[k]=a[r][c1]+","+r+","+c1;
                k++;
                }
            if(c2>0&&a[r][c2]<a[r][c]){
                result[k]=a[r][c2]+","+r+","+c2;
                k++;
                }
            int pi=0;
            if(k==0){
                break;
                }else{   
                	int max=0;
                	
                	for(int i=0;i<4;i++){
                		if(result[i]!=null){
                		String data=result[i]; 
                        String d[]=data.split(",");
                        if(max==0){
                        max=Integer.parseInt(d[0]);	
                        pi=i;
                        }else if(max<Integer.parseInt(d[0])){
                        	 max=Integer.parseInt(d[0]);
                        	 pi=i;
                        }
                       // System.out.println(max);
                		}
                	}
                    String data=result[pi]; 
                    String d[]=data.split(",");
                   // System.out.println(d[0]);
                    r=Integer.parseInt(d[1]);
                    c=Integer.parseInt(d[2]);
                    count++;
                    }
            }
            System.out.println(count+1);
        }
}
