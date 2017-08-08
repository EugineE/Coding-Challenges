import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner br=new Scanner(System.in);
		//int lines, l2;
		
		// lines = br.next();
		// l2 = br.nextLine();

		
		//String[] strs = lines.trim().split("\\s+");
		//int a[]=new int[strs.length];
		//System.out.println(lines);
		 //String s=br.nextLine();
		 //int a[]={6,2,5,5,4,5,6,3,7,6};
		/* for (int i = 0; i < 10; i++) {
				
				System.out.println(a[i]);
				}*/
		/*for (int i = 0; i < strs.length; i++) {
		a[i] = Integer.parseInt(strs[i]);
		System.out.println(a[i]);
		}*/
		
	/*	
		while(br.hasNext()){
			lines = br.nextInt();
			System.out.println(lines);
		}*/
		
		
		
		/*//scanning
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();//to come to next line
        // Write your code here.
        String s=scan.nextLine();
        Double d=scan.nextDouble();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        //format
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int j=0;j<3;j++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
             System.out.printf("%-15s%03d%n", s1, x);//%-15 for left indent 
            
        }
        System.out.println("================================");*/
        //indent
		 Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        System.out.println(n);
	        for(int i=n-1;i<0;i--){
	        	String s="#";
	            System.out.printf("%"+i+"s",new String(new char[i + 1]).replace("\0", "#") + "\r");
	        }
	}

}
