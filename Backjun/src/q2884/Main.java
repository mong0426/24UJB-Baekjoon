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
