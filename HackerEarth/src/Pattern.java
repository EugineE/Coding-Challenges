import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		char a[] =new char[26];
		int n=in.nextInt();
		for(int i=0;i<26;i++){
			a[i]=(char) (97+i);
			//System.out.println(a[i]);
		}
		int j=0,k;
		while(j<n){
			for(int i=j;i<j+n;i++){
				if(i==j){
				System.out.print(Character.toUpperCase(a[i%n]));
				}
				else{
					System.out.print(a[i%n]);	
				}
			}
			System.out.println();
			j++;
		}
	}

}
