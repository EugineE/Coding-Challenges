import java.io.*;
import java.util.*;

public class Soultion {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int numInputs = in.nextInt();
		int leftD = 0, rightD = 0;
		/*
		 * for(int j = 0; j < numInputs; j++){ for(int k = 0; k < numInputs;
		 * k++){ int a=in.nextInt(); if(j == k){ leftD += a; } if(j+k ==
		 * (numInputs-1)){ rightD += a; } } }
		 */
		for (int i = 0; i < numInputs; i++) {
			for (int j = 0; j < numInputs; j++) {
				int a = in.nextInt();
				if (i == j) {
					leftD += a;
				}
				if (i + j == (numInputs - 1)) {
					rightD += a;
				}
				// System.out.println(i+"/"+j+"a"+a);
			}
		}
		int res = Math.abs(leftD - rightD);
		System.out.println(res + " " + leftD + " " + rightD);
	}
}
