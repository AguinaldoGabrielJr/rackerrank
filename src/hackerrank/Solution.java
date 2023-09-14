package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	private static Pattern p = Pattern.compile("^[a-z]*$");

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static boolean isAlpha(String s) {
		return p.matcher(s).find();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String AReverc = reverse(A);
		boolean alpha = isAlpha(A);

		if (A.length() <= 50 && alpha == true) {
			if (A.equals(AReverc)) {
				System.out.println("Yes");
			}
		}

		sc.close();

	}
}
