package hackerrank;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			for (int j = 0; j < n; j++) {
				a += b;
				
				if (j > 0) {
					System.out.print(" ");
				}
				
				System.out.print(a);
				b = b * 2;
			}
			System.out.print("\n");
		}

		sc.close();
	}
}
