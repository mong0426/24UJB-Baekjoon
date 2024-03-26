package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		for(int i = 0; i< hat.length; i++) {
			hat[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < hat.length; i++) {
	//		System.out.println(hat[i] + "");
		}
		
		int sum = 0;
		for (int i = 0; i < hat.length; i++) {
			sum += hat[i];
		}
	//	System.out.println("sum : " + sum);
		
		int ai = -1 , aj = -1;
		for (int i = 0; i < hat.length; i++) {
			for (int j = 0; j < hat.length; j++) {
				if(i != j) {
	//			System.out.println(i + " : " + j + " = " + (hat[i] + hat[j]));
				
				if((sum - (hat[i] + hat[j]) == 100)){
					ai = i;
					aj = j;
					break;
				}
				}
			}
		}
		for (int k = 0; k < hat.length; k++) {
			if (k != ai && k != aj)
				System.out.println(hat[k]);
		}
	}
}

	
		/*
		for (int i = 0; i < hat.length-2; i++) {
			for(int j = 0; j < hat.length;j++) {
				for(int k = 0; k < hat.length; k++) {
					for(int l = 0; l < hat.length; l++)
					{for(int n = )
				} 
			}
			
				
				
			}
		}
	/*	int i = 0;
		while ((sum += ++i)<100) {
			i++;
		
			if (sum==100) {
		System.out.println(sum[1]);
		System.out.println(sum[2]);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
			}
		} */

