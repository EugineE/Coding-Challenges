

	import java.io.*;
	import java.util.*;


	public class TestClass {
	      static int result=0;
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i=0; t_i<T; t_i++)
	        {
	            int n = Integer.parseInt(br.readLine().trim());
	            String[] arr_arr = br.readLine().split(" ");
	            int[] arr = new int[n];
	            for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
	            {
	            	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
	            }

	            int out_ = score(arr);
	            System.out.println(out_);
	            System.out.println("");
	         }

	         wr.close();
	         br.close();
	    }
	    static int score(int[] arr){
	        // Write your code here
	    	System.out.println("hi");
	    	int r=0;
	        r=test(arr);
	        System.out.println(r);
	       return r;
	       
	    }
	    private static int test(int arr[]){
	        int n=arr.length;
	       int i=0;
	        while(i==0){
	        	 System.out.println("hi");
	            int t1[]=new int[n/2];
	            int t2[]=new int[n/2];
	            t1=div(arr,0,n/2); 
	            t2=div(arr,(n/2)+1,n);
	            int tv1=fun(t1);
	            int tv2=fun(t2);
	            if(tv1==tv2){
	                result++;
	               
	            }
	           /* if(t1.length/2!=0)
	            test(t1);
	            if(t2.length/2!=0)
	            test(t2);*/
	            i++;
	        } 
	        return result;
	    }
	    private static int[] div(int arr[],int s,int e){
	        int t[]=new int[arr.length/2];
	        for(int i=s,j=0;i<e;i++){
	            t[j]=arr[i];
	            j++;
	        }
	        return t;
	    }
	    private static int fun(int arr[]){
	        int val=0;
	         for(int i=0;i<arr.length;i++){
	            for(int k=1; k <= arr[i] ;k++){
	                int d=arr[i] % k;
	             if(d==0){
	             val+=k;    
	             }
	         } 
	         }
	         return val;
	    }
	}

