package q2440;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for(int i = a; i > 0; i--) {
			for(int j = i ; j > 0 ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
}

