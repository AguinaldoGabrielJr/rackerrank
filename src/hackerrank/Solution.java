package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	private static Pattern p = Pattern.compile("^[a-zA-Z]*$");

	public static boolean isAlpha(String s) {
		return p.matcher(s).find();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean alpha = isAlpha(S);
		int start = sc.nextInt();
		int end = sc.nextInt();

		int length = S.length();

		System.out.println(S.subSequence(start, end));

		sc.close();

	}
}