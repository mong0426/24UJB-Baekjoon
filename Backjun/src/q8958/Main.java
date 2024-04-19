package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int c = 0;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			String b = sc.next();

			for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j) == 'O') {
					c++;
					sum += c;
				} else {
					c = 0;
				}
			}
			System.out.println(sum);
			c = 0;
			sum = 0;
		}
		sc.close();
	}

}
