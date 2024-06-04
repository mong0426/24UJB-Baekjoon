package q15649;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] hong = new int[n][m];
		sc.close();
		for(int i=1;i<hong.length;i++) {
			for(int j=1;j<hong[i].length;j++) {
				if(i == j) {
					
				}else {
					System.out.print(hong[i][j]);
					System.out.println();
				}

			}
		}
	
	}

}
