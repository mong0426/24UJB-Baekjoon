package q2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=num;i>0;i--) {
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
