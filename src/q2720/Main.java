package q2720;


import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);

      int T = sc.nextInt();

      for (int i = 0; i < T; i++) {
         int C = sc.nextInt();

         System.out.printf("%d %d %d %d %n", 
               C / 25, 
               C % 25 / 10, 
               C % 25 % 10 / 5, 
               C % 25 % 10 % 5 / 1);
      }
      sc.close();
   }
   
}