package hackerrank;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		int area;

		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int h = sc.nextInt();

		if (b <= 100 && b >= -100) {
			if (h <= 100 && h >= -100) {
				
				area = b * h;
				if (b < 0 && h < 0) {
					area = b * h;
				
					if (area > 0) {
						area *= -1;

					}
				}
				if (area > 0) {
					System.out.println(area);
				} else {
					System.out.println("java.lang.Exception: Breadth and height must be positive");
				}

			}

		}
		sc.close();
	}
}
