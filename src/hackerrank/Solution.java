package hackerrank;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String ipRegex = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

		while (scanner.hasNextLine()) {
			String ipAddress = scanner.nextLine();
			boolean isValid;
			try {
				isValid = ipAddress.matches(ipRegex);
			} catch (Exception e) {
				isValid = false;
			}

			if (isValid) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}
}