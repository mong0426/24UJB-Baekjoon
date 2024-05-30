package q1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		
		StringTokenizer b = new StringTokenizer(a," ");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] s = br.readLine().split(" ");
//		int cnt = 0;
//		for(int i=0;i<s.length;i++) {
//			cnt++;
//		}
		
		System.out.println(b.countTokens());
		}
	}

