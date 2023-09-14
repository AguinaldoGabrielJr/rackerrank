package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	private static Pattern p = Pattern.compile("^ [A-Za-z !,?._'@]+");

	public static boolean isAlpha(String s) {
		return p.matcher(s).find();
	}

	private static String removeLeadingNonLetters(String str) {
		int i;
		for (i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				break;
			}
		}
		return str.substring(i);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		boolean alpha = isAlpha(s);
		s = removeLeadingNonLetters(s);
		
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

		String tokens[] = s.split("[!,?._'@\\s]+");
		
		System.out.println(tokens.length);
		for (String token : tokens) {
			System.out.println(token);

		}
	}
}
