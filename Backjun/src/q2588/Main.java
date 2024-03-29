package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();
		
		
//		2번째 방법
//		int inum1 = Integer.parseInt(num1);
//		
//		int inum2 = num2.charAt(2)-'0';		
//		System.out.println(inum1*inum2);
//		inum2 = num2.charAt(1)-'0';		
//		System.out.println(inum1*inum2);
//		inum2 = num2.charAt(0)-'0';		
//		System.out.println(inum1*inum2);
//		
//		System.out.println(inum1*Integer.parseInt(num2));
		
		
		
		
		
		//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//
//		int b1 = b % 10;
//		int b2 = b / 10;
//		b2 %= 10;
//		int b3 = b / 100;
//
//		System.out.println(a * b1);
//		System.out.println(a * b2);
//		System.out.println(a * b3);
//		System.out.println(a * b);

	}

}

//3번
//import java.util.Scanner;
//
//public class Main1 {
//
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int num1 = sc.nextInt();
//      int num2 = sc.nextInt();
//      int multAll = 0;
//      sc.close();
//
//      String StringAll3 = Integer.toString(num2);
//      String String3 = StringAll3.substring(2);
//      int Chnum3 = Integer.parseInt(String3);
//      char String2 = StringAll3.charAt(1);
//      int Chnum2 = Character.getNumericValue(String2);
//      char String1 = StringAll3.charAt(0);
//      int Chnum1 = Character.getNumericValue(String1);
//
//      System.out.println(num1 * Chnum3);
//      System.out.println(num1 * Chnum2);
//      System.out.println(num1 * Chnum1);
//
//      if (num1 >= 100 && num2 >= 100) {
//         multAll = num1 * num2;
//      }
//      System.out.println(multAll);
//   }
//}

//4번
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int num1;
//        String str;
//        Scanner sc = new Scanner(System.in);
//        num1 = sc.nextInt();
//        str = sc.next();
//        sc.close();
//
//        char num2[] = str.toCharArray();
//        char[] reverse = str.toCharArray();
//        int mul = 0; 
//        for (int i = num2.length - 1, j = 0; i >= 0; i--, j++) {
//            reverse[j] = num2[i];
//        }
//        int sum = 0;
//        for (int i = 0; i < reverse.length; i++) {
//            mul = num1 * (reverse[i] - '0'); 
//            System.out.println(mul);
//            sum += mul;
//        }
//        System.out.println(sum);
//    }
//}
