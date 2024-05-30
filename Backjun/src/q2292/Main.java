package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

//		for (int i = 1; i <= 70; i++) {
//			if (a > 62) {
//				System.out.println("6");
//				break;
//			} else if (a > 37) {
//				System.out.println("5");
//				break;
//			} else if (a > 19) {
//				System.out.println("4");
//				break;
//			} else if (a > 7) {
//				System.out.println("3");
//				break;
//			} else if (a > 1) {
//				System.out.println("2");
//				break;
//			} else if (a == 1) {
//				System.out.println("1");
//				break;
//			}
//		}
		
		int r = 1, m = 1;
		while (true) {
			if (a <= r) {
				break;
			}
			r = r + 6 * m++;
		}
		System.out.println(m);
	}

}
