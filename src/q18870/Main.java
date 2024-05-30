package q18870;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] x = new int[n];

		
		
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();

			
			System.out.print(x);
		
		}
		Arrays.sort(x);
		System.out.println();
	}

}
