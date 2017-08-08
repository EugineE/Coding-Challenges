
//import for Scanner and other utility classes
import java.util.*;

public class BoardGame {
	public static void main(String args[]) throws Exception {

		// Scanner
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// s.nextLine();
		int a[][] = new int[n + 1][n+1];
		int k;
		for (int i = 1; i < n + 1; i++) {
			k = 1;
		//	System.out.println(k);
			while (k<n+1) {
				a[i][k] = s.nextInt();
				//System.out.println(k +""+i);
				k++;
			}

			// s.nextLine();
		}

		Boolean f1 = false, f2 = false;
		int i = 1;
		for (int j = 1; j < n + 1; j++) {
			if ((a[j][i] == 1) && f1 == false) {
				int a1r = j;
				int a1c = i;
				f1 = score(a, a1r, a1c, n, 1);
				if (f1) {
					continue;
				}
			} else if (a[j][i] == 2 && f2 == false) {
				int r = j;
				int c = i;
				f2 = score(a, r, c, n, 2);
			}
		}
		if (f1) {
			System.out.println("1");
		} else if (f2) {
			System.out.println("2");
		} else if (f1 == true && f2 == true) {

			System.out.println("AMIB");
		} else {
			System.out.println("0");
		}
	}

	public static Boolean score(int a[][], int r, int c, int n, int v) {
		for (int i = -1; i < 2; i++) {
			if (a[r + i][c + 1] == v) {
				if (c == n) {
					return true;
				} else {
					return score(a, r + 1, c + 1, n, v);
				}
			}
		}
		return false;
	}
}
