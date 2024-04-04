//package q2884;
//
//import java.util.Scanner;
//
//public class Main {
//		
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = m-45;
//		
//		if(sum<0) {
//			
//		}
//		
//	}
//
//}

// 1번 풀이
package q2884;

import java.util.Scanner;
//1 10 - 0 25
//0 45 - 0 0

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

//		System.out.println(H);
//		System.out.println(M);

		if (M < 60) {
			H -= 1;
			M += 60;
		}
		M -= 45;
		if (M >= 60) {
			H += 1;
			M -= 60;
		}
		if (H <= 0) {
			H = 24 + H;
		}
		if (H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}
}

// 2번 풀이
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int H, M;
      Scanner sc = new Scanner(System.in);
      H = sc.nextInt();
      M = sc.nextInt();
      sc.close();
      if (M > 44) {
         System.out.printf("%d %d", H, M - 45);
      } else if ((M < 45) && (H > 0)) {
         System.out.printf("%d %d", H - 1, M + 15);
      } else {
         System.out.printf("%d %d", 23, M + 15);
      }
   }

}

//3번 풀이
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
   
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      sc.close();
      
      String[] values = input.split("\\s+");
      
      int h = Integer.parseInt( values[0]) * 60;
      int m = Integer.parseInt( values[1]);
      
      int sum = h + m - 45;
      
      int day = 24*60;
      if(sum >= day)      
         sum -= day;
      
      else if(sum < 0)      
         sum += day;      
      
      int result_m = sum % 60;
      int result_h = sum / 60;
      
      System.out.println(result_h + " " + result_m);
      
   }
}
