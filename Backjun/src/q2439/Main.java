package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		sc.close();
//		
//		
//		for(int i = 1;i <= a;i++) {
//			for(int j=a-i-1;j>=0;j--) {
//				System.out.printf(" ");		
//			}
//
//			for(int k=0;k<i;k++) {
//				System.out.print("*");
//			}	
//			
//		System.out.println();
//		}
//	}
//
//}

int a = sc.nextInt();
sc.close();   
for (int i = 1; i <= a; i++) { // 행 ---------
   for (int j = a; j >= 1; j--) {// 열|||||||||
      if(i>=j) {
            System.out.print("*");
            }else{
            System.out.print(" ");
            }
      
      if (j==1 && i <= a) {
         System.out.print("\n");

      }
   }
   }
}
}
