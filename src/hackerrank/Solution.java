package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

	public static boolean isValidPattern(String pattern) {
		try {
			Pattern.compile(pattern);
			return true;
		} catch (PatternSyntaxException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		while (testCases > 0) {
			String pattern = in.nextLine();
			if (isValidPattern(pattern)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}

			testCases--;
		}
		in.close();
	}
}
